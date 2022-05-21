package com.springboot.sprintboottest.Entity;

public class SkillUnit{
    public String name;
    public String nameVal;

    public SkillUnit(String name, String nameVal, Integer initVal, Integer growthVal, Integer interestVal, Integer jobVal) {
        this.name = name;
        this.nameVal = nameVal;
        this.initVal = initVal;
        this.growthVal = growthVal;
        this.interestVal = interestVal;
        this.jobVal = jobVal;
    }
    public SkillUnit(SkillUnit t) {
        this.name = t.name;
        this.nameVal = t.nameVal;
        this.initVal = t.initVal;
        this.growthVal = t.growthVal;
        this.interestVal = t.interestVal;
        this.jobVal = t.jobVal;
    }
    public Integer sum(){
        return initVal + growthVal + interestVal + jobVal;
    }

    public Integer initVal;
    public Integer growthVal;
    public Integer interestVal;
    public Integer jobVal;
}