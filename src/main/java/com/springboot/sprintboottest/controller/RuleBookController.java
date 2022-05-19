package com.springboot.sprintboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RuleBookController {
//    @GetMapping("/roleBook")
//    public String roleBook(){
//        return "roleBook";
//    }
    @GetMapping("/roleBook/ch1")
    public String ruleBookch1(){
        return "roleBook-ch1";
    }
    @GetMapping("/roleBook/ch2")
    public String ruleBookch2(){
        return "roleBook-ch2";
    }
    @GetMapping("/roleBook/ch3")
    public String ruleBookch3(){
        return "roleBook-ch3";
    }
    @GetMapping("/roleBook/ch4")
    public String ruleBookch4(){
        return "roleBook-ch4";
    }
    @GetMapping("/roleBook/ch5")
    public String ruleBookch5(){
        return "roleBook-ch5";
    }
    @GetMapping("/roleBook/ch6")
    public String ruleBookch6(){
        return "roleBook-ch6";
    }
    @GetMapping("/roleBook/ch7")
    public String ruleBookch7(){
        return "roleBook-ch7";
    }
    @GetMapping("/roleBook/ch8")
    public String ruleBookch8(){
        return "roleBook-ch8";
    }
    @GetMapping("/roleBook/ch9")
    public String ruleBookch9(){
        return "roleBook-ch9";
    }
    @GetMapping("/roleBook/ch10")
    public String ruleBookch10(){
        return "roleBook-ch10";
    }

    @GetMapping("/roleBook/ch11")
    public String ruleBookch11(){
        return "roleBook-ch11";
    }
    @GetMapping("/roleBook/ch12")
    public String ruleBookch12(){
        return "roleBook-ch12";
    }
    @GetMapping("/roleBook/ch13")
    public String ruleBookch13(){
        return "roleBook-ch13";
    }
    @GetMapping("/roleBook/ch14")
    public String ruleBookch14(){
        return "roleBook-ch14";
    }
    @GetMapping("/roleBook/ch15")
    public String ruleBookch15(){
        return "roleBook-ch15";
    }
    @GetMapping("/roleBook/appendix1")
    public String roleBookAppendix1(){
        return "roleBook-appendix1";
    }
    @GetMapping("/roleBook/translateTable")
    public String roleBookTranslateTable(){
        return "roleBook-translateTable";
    }
}
