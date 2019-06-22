package cn.liupeng.controller;

import cn.liupeng.model.User;
import cn.liupeng.service.IUserService;
import cn.liupeng.tools.CheakPasswordTool;
import cn.liupeng.tools.TheGlobalVariable;
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
        String returnValue = null;
        if ("".equals(user_name)) {

        }
        CheakPasswordTool cheakPasswordTool = new CheakPasswordTool(user_password, user_confirm_password);
        if (cheakPasswordTool.isKey()) {
            returnValue = cheakPasswordTool.getReturnInformation();
        } else {
            returnValue = cheakPasswordTool.getReturnInformation();
        }
        return returnValue;
    }

}
