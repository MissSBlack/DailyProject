package com.adc.daily.entity;

public class DailyEO {
    private String id;
    private String dailyDate;
    private String project;
    private String firstModule;
    private String secondModule;
    private String problemType;
    private String priority;
    private String content;
    private String handler;
    private String handleTime;
    private String isInPlan;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDailyDate() {
        return dailyDate;
    }

    public void setDailyDate(String dailyDate) {
        this.dailyDate = dailyDate;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getFirstModule() {
        return firstModule;
    }

    public void setFirstModule(String firstModule) {
        this.firstModule = firstModule;
    }

    public String getSecondModule() {
        return secondModule;
    }

    public void setSecondModule(String secondModule) {
        this.secondModule = secondModule;
    }

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHandler() {
        return handler;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public String getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(String handleTime) {
        this.handleTime = handleTime;
    }

    public String getIsInPlan() {
        return isInPlan;
    }

    public void setIsInPlan(String isInPlan) {
        this.isInPlan = isInPlan;
    }
}
