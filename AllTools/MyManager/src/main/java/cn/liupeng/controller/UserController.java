package cn.liupeng.controller;

import cn.liupeng.model.User;
import cn.liupeng.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(path = "/login")
    public String login() {
        System.out.println("success");
        System.out.println("开始执行find方法");
        User user = userService.selectByUUID("12KJB12312RFVG2");
        System.out.println(user);
        System.out.println("结束执行find方法");
        return "success";
    }

    @RequestMapping(path = "/find")
    public String find(String uuid) {
        System.out.println("开始执行find方法");
        User user = userService.selectByUUID(uuid);
        System.out.println(user);
        System.out.println("结束执行find方法");
        return "success";
    }

}
