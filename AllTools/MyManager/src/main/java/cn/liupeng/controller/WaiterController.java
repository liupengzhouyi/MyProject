package cn.liupeng.controller;

import cn.liupeng.model.User;
import cn.liupeng.model.Waiter;
import cn.liupeng.service.IWaiterService;
import cn.liupeng.tools.DateTime.GetDateTime;
import cn.liupeng.tools.IPAdress.IPAdress;
import cn.liupeng.tools.Password.CheakPasswordTool;
import cn.liupeng.tools.Password.PasswordToPasswordValue;
import cn.liupeng.tools.TheGlobalVariable;
import cn.liupeng.tools.User.CreateUser_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(path = "/waiter")
public class WaiterController {

    @Autowired
    private IWaiterService waiterService;

    /**
     * 服务员注册
     * @param waiter_name
     * @param waiter_password
     * @param waiter_confirm_password
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @RequestMapping(path = "/registration")
    public String registration(String waiter_name, String waiter_password, String waiter_confirm_password, HttpServletRequest httpServletRequest) throws Exception {
        String returnValue = null;
        if ("".equals(waiter_name)) {
            String returninformation = TheGlobalVariable.NOUSERNAME;
        } else {
            CheakPasswordTool cheakPasswordTool = new CheakPasswordTool(waiter_password, waiter_confirm_password);
            if (cheakPasswordTool.isKey()) {
                returnValue = cheakPasswordTool.getReturnInformation();
                String waiter_id = new CreateUser_ID().getUser_id();
                String waiter_registered_ip_adress = new IPAdress(httpServletRequest).getIpAdress();
                String waiter_password_value = new PasswordToPasswordValue(waiter_password).getPasswordVlaue() + "";
                String waiter_registered_time = new GetDateTime().getDateTime();
                Waiter waiter = new Waiter();
                waiter.setWaiter_id(waiter_id);
                waiter.setWaiter_name(waiter_name);
                waiter.setWaiter_password_value(waiter_password_value);
                waiter.setWaiter_registered_time(waiter_registered_time);
                waiter.setWaiter_registered_ip_adress(waiter_registered_ip_adress);
                System.out.println(waiter);
                System.out.println("waiter注册开始！");
                this.waiterService.insert(waiter);
                System.out.println("waiter注册结束！");
            } else {
                returnValue = cheakPasswordTool.getReturnInformation();
            }
        }
        return returnValue;
    }



    @RequestMapping(path = "/landing")
    public String landing(String waiter_id, String waiter_password, HttpServletRequest httpServletRequest) throws Exception {
        String returnValue = null;
        boolean key = false;
        String returnInformation = null;
        if ("".equals(waiter_id) || "".equals(waiter_password)) {
            // 填写内容不全
            returnInformation = TheGlobalVariable.NOTENOUGHLANDINGINFORMATION;
            returnValue = TheGlobalVariable.ERROR;
        } else {
            // 开始操作
            String waiter_password_value = new PasswordToPasswordValue(waiter_password).getPasswordVlaue() + "";
            Waiter waiter = new Waiter(waiter_id, waiter_password_value);
            String waiter_registered_ip_adress = new IPAdress(httpServletRequest).getIpAdress();
            waiter.setWaiter_registered_ip_adress(waiter_registered_ip_adress);
            System.out.println(waiter);
            key = this.waiterService.landing(waiter);
            System.out.println(key);
        }
        if (key) {
            returnValue = TheGlobalVariable.SUCCESSS;
        } else {
            returnValue = TheGlobalVariable.ERROR;
        }
        return returnValue;
    }


    @RequestMapping(path = "/test")
    public ModelAndView test() {
        List<Waiter> list = this.waiterService.select();
        for (Waiter waiter:list) {
            System.out.println(waiter);
        }
        ModelAndView modelAndView = new ModelAndView(TheGlobalVariable.ERROR);
        return modelAndView;
    }

}
