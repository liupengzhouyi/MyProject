package cn.liupeng.controller;

import cn.liupeng.model.TestTable;
import cn.liupeng.model.User;
import cn.liupeng.service.ITestTableService;
import cn.liupeng.service.IUserService;
import cn.liupeng.tools.DateTime.GetDateTime;
import cn.liupeng.tools.IPAdress.IPAdress;
import cn.liupeng.tools.Password.CheakPasswordTool;
import cn.liupeng.tools.Password.PasswordToPasswordValue;
import cn.liupeng.tools.TheGlobalVariable;
import cn.liupeng.tools.User.CreateUser_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private ITestTableService testService;

    @RequestMapping(path = "/login")
    public String login() {
        System.out.println("success");
        /*List<TestTable> list = this.testService.listTest();
        for (TestTable testTable : list) {
            System.out.println("------------");
            System.out.println(testTable);
            System.out.println("------------");
        }*/
        List<User> list = this.userService.listUser();
        for (User user : list) {
            System.out.println("------------");
            System.out.println(user);
            System.out.println("------------");
        }
        return "success";
    }

    @RequestMapping(path = "/find")
    public String find(String uuid_ii, HttpServletRequest httpServletRequest) throws Exception {
        System.out.println("开始执行find方法");
        System.out.println(uuid_ii);
        String IP = new IPAdress(httpServletRequest).getIpAdress();
        System.out.println("IP: " +IP);
        /*User user = userService.selectByUUID(uuid);
        System.out.println(user);*/
        System.out.println("结束执行find方法");
        return "success";
    }


    @RequestMapping(path = "/registration")
    public String registration(String user_name, String user_password, String user_confirm_password, HttpServletRequest httpServletRequest) throws Exception {
        String returnValue = null;
        if ("".equals(user_name)) {
            String returninformation = TheGlobalVariable.NOUSERNAME;
        } else {
            CheakPasswordTool cheakPasswordTool = new CheakPasswordTool(user_password, user_confirm_password);
            if (cheakPasswordTool.isKey()) {
                returnValue = cheakPasswordTool.getReturnInformation();
                String user_registered_ip_adress = new IPAdress(httpServletRequest).getIpAdress();
                System.out.println("IP: " + user_registered_ip_adress);
                User user = new User();
                user.setUser_id(new CreateUser_ID().getUser_id());
                user.setUser_name(user_name);
                user.setUser_password_value(new PasswordToPasswordValue(user_password).getPasswordVlaue() + "");
                user.setUser_registered_time(new GetDateTime().getDateTime());
                user.setUser_registered_ip_adress(user_registered_ip_adress);
                System.out.println(user);
                System.out.println("用户注册开始！");
                userService.registration(user);
                System.out.println("用户注册结束！");
            } else {
                returnValue = cheakPasswordTool.getReturnInformation();
            }
        }
        return returnValue;
    }

}
