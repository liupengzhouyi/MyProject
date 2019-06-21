package cn.liupeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/baseOperation")
public class UserOperationController {


    @RequestMapping(path = "/userRegistration")
    public String userRegistration() {
        String returnValue = "userRegistration";
        return returnValue;
    }



}
