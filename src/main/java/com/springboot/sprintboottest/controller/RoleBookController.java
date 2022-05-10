package com.springboot.sprintboottest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RoleBookController {
//    @GetMapping("/roleBook")
//    public String roleBook(){
//        return "roleBook";
//    }
    @GetMapping("/roleBook/ch1")
    public String roleBookch1(){
        return "roleBook-ch1";
    }
    @GetMapping("/roleBook/ch2")
    public String roleBookch2(){
        return "roleBook-ch2";
    }
    @GetMapping("/roleBook/ch3")
    public String roleBookch3(){
        return "roleBook-ch3";
    }
    @GetMapping("/roleBook/ch4")
    public String roleBookch4(){
        return "roleBook-ch4";
    }
    @GetMapping("/roleBook/ch5")
    public String roleBookch5(){
        return "roleBook-ch5";
    }
    @GetMapping("/roleBook/ch6")
    public String roleBookch6(){
        return "roleBook-ch6";
    }
    @GetMapping("/roleBook/ch7")
    public String roleBookch7(){
        return "roleBook-ch7";
    }
    @GetMapping("/roleBook/ch8")
    public String roleBookch8(){
        return "roleBook-ch8";
    }
    @GetMapping("/roleBook/ch9")
    public String roleBookch9(){
        return "roleBook-ch9";
    }
    @GetMapping("/roleBook/ch10")
    public String roleBookch10(){
        return "roleBook-ch10";
    }

    @GetMapping("/roleBook/ch11")
    public String roleBookch11(){
        return "roleBook-ch11";
    }
    @GetMapping("/roleBook/ch12")
    public String roleBookch12(){
        return "roleBook-ch12";
    }
    @GetMapping("/roleBook/ch13")
    public String roleBookch13(){
        return "roleBook-ch13";
    }
    @GetMapping("/roleBook/ch14")
    public String roleBookch14(){
        return "roleBook-ch14";
    }
    @GetMapping("/roleBook/ch15")
    public String roleBookch15(){
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
