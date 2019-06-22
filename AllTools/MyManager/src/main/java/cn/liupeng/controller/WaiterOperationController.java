package cn.liupeng.controller;

import cn.liupeng.tools.TheGlobalVariable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

}
