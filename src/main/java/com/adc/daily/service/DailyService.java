package com.adc.daily.service;

import com.adc.daily.entity.DailyEO;
import com.adc.daily.mapper.DailyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DailyService {
    @Autowired
    private DailyMapper dailyMapper;

    public List<DailyEO> getDailyList() {
        return dailyMapper.getDailyList();
    }

    public void saveDaily(DailyEO dailyEO) {
        dailyEO.setId(UUID.randomUUID().toString());
        dailyEO.setDel("0");
        dailyMapper.saveDaily(dailyEO);
    }
    public void updateDaily(DailyEO dailyEO){
        dailyEO.setDel("0");
        dailyMapper.updateDaily(dailyEO);
    }
    public void delDaily(String id){
        dailyMapper.delDaily(id);
    }
}
