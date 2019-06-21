package cn.liupeng.controller;

import cn.liupeng.model.User;
import cn.liupeng.service.IUserService;
import cn.liupeng.tools.CheakPasswordTool;
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
        return "success";
    }

    @RequestMapping(path = "/find")
    public String find(String uuid_ii) {
        System.out.println("开始执行find方法");
        System.out.println(uuid_ii);
        /*User user = userService.selectByUUID(uuid);
        System.out.println(user);*/
        System.out.println("结束执行find方法");
        return "success";
    }

    @RequestMapping(path = "/registration")
    public String registration(String user_name, String user_password, String user_confirm_password) {
        String returnValue = "success";
        if (user_password.equals(user_confirm_password)) {
            if (user_password.length() < 6) {
                returnValue = "illegalPassword";
            } else {
                CheakPasswordTool cheakPasswordTool = new CheakPasswordTool(user_password);
                if (cheakPasswordTool.isKey()) {
                    //开始用户注册
                    System.out.println(user_name);
                    System.out.println(user_password);
                    System.out.println(user_confirm_password);
                } else {
                    returnValue = "illegalPassword";
                }
            }
        } else {
            returnValue = "differentPassword";
        }
        return returnValue;
    }

}
