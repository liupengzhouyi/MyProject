package cn.liupeng.controller;

import cn.liupeng.model.Waiter;
import cn.liupeng.tools.TheGlobalVariable;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author liupeng
 */
@Controller
@RequestMapping(path = "/waiterOperation")
public class WaiterOperationController {

    /**
     * 转向-注册页面
     * @return
     */
    @RequestMapping(path = "/registration")
    public ModelAndView waiterRegistration() {
        String returnPageName = TheGlobalVariable.WAITERREGISTRATION;
        ModelAndView modelAndView = new ModelAndView(returnPageName);
        return modelAndView;
    }

    /**
     * 转向-登陆页面
     * @return
     */
    @RequestMapping(path = "/landing")
    public ModelAndView waiterLanding() {
        String returnPageName = TheGlobalVariable.WAITERLANDING;
        ModelAndView modelAndView = new ModelAndView(returnPageName);
        return modelAndView;
    }

    /**
     * 转向-ID查询页面
     * @return
     */
    @RequestMapping(path = "/findWaiterByID")
    public ModelAndView findWaiterByID() {
        String returnPageName = TheGlobalVariable.FINDWAITERBYID;
        ModelAndView modelAndView = new ModelAndView(returnPageName);
        return modelAndView;
    }

    /**
     * 服务员修改密码 - 输入旧密码页面
     * @return
     */
    @RequestMapping(path = "/inputOrderPassword")
    public ModelAndView inputOrdPassword() {
        ModelAndView modelAndView = new ModelAndView(TheGlobalVariable.WAITERINPUTORDPASSWORD);
        return modelAndView;
    }

    /**
     * 服务员修改用户名 - 输入旧密码页面
     * @return
     */
    @RequestMapping(path = "/inputOrderName")
    public ModelAndView inputOrdWaiterName() {
        ModelAndView modelAndView = new ModelAndView(TheGlobalVariable.INPUTORDNAME);
        return modelAndView;
    }

    /**
     * 查询某一个服务员的登陆记录
     * @return
     */
    @RequestMapping(path = "/selectWaiterLanding")
    public ModelAndView selectWaiterLanding() {
        ModelAndView modelAndView = new ModelAndView(TheGlobalVariable.SELECTWAITERLANDINGID);
        return modelAndView;
    }

}
