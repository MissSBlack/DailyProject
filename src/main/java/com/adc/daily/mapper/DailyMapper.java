package com.adc.daily.mapper;

import com.adc.daily.entity.DailyEO;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
@Mapper
public interface DailyMapper {
    @Select("select * from daily_project where DEL = 0 ORDER BY daily_project.DAILY_DATE DESC,HANDLER DESC")
    List<DailyEO> getDailyList();
    @Insert("insert into daily_project (id,DAILY_DATE,PROJECT,FIRST_MODULE,SECOND_MODULE,PROBLEM_TYPE,PRIORITY,CONTENT,HANDLER,HANDLE_TIME,IS_IN_PLAN,DEL) values(#{id},#{dailyDate},#{project},#{firstModule},#{secondModule},#{problemType},#{priority},#{content},#{handler},#{handleTime},#{isInPlan},#{del})")
    void saveDaily(DailyEO dailyEO);
    @Update("update daily_project set DAILY_DATE = #{dailyDate},PROJECT = #{project},FIRST_MODULE = #{firstModule},SECOND_MODULE = #{secondModule},PROBLEM_TYPE = #{problemType},PRIORITY = #{priority},CONTENT = #{content},HANDLER = #{handler},HANDLE_TIME = #{handleTime},IS_IN_PLAN = #{isInPlan},DEL = #{del} where id = #{id}")
    void updateDaily(DailyEO dailyEO);
    @Update("update daily_project set DEL = 1 where id = #{id}")
    void delDaily(@Param("id")String id);
}
