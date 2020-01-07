package com.adc.daily.controller;

import com.adc.daily.entity.DailyEO;
import com.adc.daily.service.DailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DailyController {
    @Autowired
    private DailyService dailyService;
    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return  page;
    }
    @RequestMapping("/")
    public String showPage(){
        return  "index";
    }
    @GetMapping("/getDailyList")
    @ResponseBody
    public List<DailyEO> getDailyList(){
        try{
           /* List<DailyEO> dailyEOS = dailyService.getDailyList();
            DailyEO dailyEO = dailyEOS.get(0);
            dailyService.saveDaily(dailyEO);*/
            return dailyService.getDailyList();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    @PostMapping("/saveDaily")
    @ResponseBody
    public String  saveDaily(@RequestBody DailyEO dailyEO){
        try{
            dailyService.saveDaily(dailyEO);
            return "保存成功！";
        }catch (Exception e){
            e.printStackTrace();
            return "保存失败";
        }
    }
}
