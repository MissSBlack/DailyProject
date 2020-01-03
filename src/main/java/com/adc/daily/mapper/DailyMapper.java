package com.adc.daily.mapper;

import com.adc.daily.entity.DailyEO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface DailyMapper {
    @Select("select * from daily_project ")
    List<DailyEO> getDailyList();
    @Insert("insert into daily_project (id,DAILY_DATE,PROJECT,FIRST_MODULE,SECOND_MODULE,PROBLEM_TYPE,PRIORITY,CONTENT,HANDLER,HANDLE_TIME,IS_IN_PLAN) values(#{id},#{dailyDate},#{project},#{firstModule},#{secondModule},#{problemType},#{priority},#{content},#{handler},#{handleTime},#{isInPlan})")
    void saveDaily(DailyEO dailyEO);
}
