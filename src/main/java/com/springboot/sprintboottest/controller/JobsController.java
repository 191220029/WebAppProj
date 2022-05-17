package com.springboot.sprintboottest.controller;

import com.springboot.sprintboottest.Entity.Job;
import com.springboot.sprintboottest.Repository.JobListRepository;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.Tuple;
import java.nio.channels.MulticastChannel;
import java.util.List;

@Controller
public class JobsController {
    @Autowired
    JobListRepository jobListRepository;
    @ResponseBody
    @RequestMapping("/jobs/all")
    public List<Job> allJobs(){
        return jobListRepository.findAllJobs();
    }

    @ResponseBody
    @RequestMapping("/jobs/findJobById")
    public Job findJobById(
            @RequestParam("jobId") Integer jobId
    ){
        return jobListRepository.findByJobId(jobId);
    }
    @ResponseBody
    @RequestMapping("/jobs/calculateSkillPoints")
    public String calculateSkillPoints(
            @RequestParam("formula") String Oformula,
            @RequestParam("edu") Integer edu,
            @RequestParam("dex") Integer dex,
            @RequestParam("app") Integer app,
            @RequestParam("str") Integer str,
            @RequestParam("pow") Integer pow,
            @RequestParam("str") Integer intel
    ){
        Integer jobSkillPoints = 0, interestSkillPoints = intel * 2;
        // 按“或”分割计算公式
        String[] formulas = Oformula.split("或");
        for(String formula : formulas){
            // 按"+"分项再求和
            System.out.println("formula:"+formula);
            Integer sum = 0;
            String[] tokens = formula.split("＋");
            for(String token : tokens){
                System.out.println("token:"+token);
                String type;
                Integer multiplier;
                if(token.indexOf('×') < 0) {
                    System.out.println("Using default multiplier 0");
                    type = token;
                    multiplier = 1;
                }
                else {
                    type = token.substring(0, token.indexOf('×')) ;
                    multiplier = Integer.parseInt(token.substring(token.indexOf('×') + 1));
                }
                System.out.println("type:"+type);
                System.out.println("multiplier:" +multiplier);
                switch(type){
                    case "教育": {
                        sum += multiplier * edu;
                        break;
                    }
                    case "敏捷":{
                        sum += multiplier * dex;
                        break;
                    }
                    case "外貌":{
                        sum += multiplier * app;
                        break;
                    }
                    case "力量":{
                        sum += multiplier * str;
                        break;
                    }
                    case "意志":{
                        sum += multiplier * pow;
                        break;
                    }
                    default:
                        System.out.println("calculateSkillPoints: Unhandled formula type " + type);
                }
            }
            jobSkillPoints = Math.max(jobSkillPoints, sum);
        }
        return jobSkillPoints.toString() + "," + interestSkillPoints.toString();
    }

    @GetMapping("/jobs/jobTable")
    public String jopTable(){
        return "jobTable";
    }
}
