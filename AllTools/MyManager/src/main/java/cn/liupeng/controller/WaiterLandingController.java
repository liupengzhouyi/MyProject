package cn.liupeng.controller;

import cn.liupeng.mapper.Waiter_landingMapper;
import cn.liupeng.model.Waiter;
import cn.liupeng.model.Waiter_landing;
import cn.liupeng.tools.Return.Information;
import cn.liupeng.tools.TheGlobalVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(path = "/WaiterLanding")
public class WaiterLandingController {

    @Autowired
    protected Waiter_landingMapper waiter_landingMapper;

    @RequestMapping(path = "/add")
    public ModelAndView addWaiterLandingRecord(HttpServletRequest httpServletRequest) {
        HttpSession httpSession = httpServletRequest.getSession();
        Waiter_landing waiter_landing = (Waiter_landing) httpSession.getAttribute("waiter_landing");
        System.out.println(waiter_landing);
        this.waiter_landingMapper.addLandingRecord(waiter_landing);
        ModelAndView modelAndView = new ModelAndView();
        return  modelAndView;
    }

    /**
     * 获取所有服务员的登陆记录
     * @return
     */
    @RequestMapping(path = "/listWaiterLandingRecord")
    public ModelAndView listWaiterLanding() {
        List<Waiter_landing> list = this.waiter_landingMapper.getAllWaiterLandingRecord();
        Information information = new Information();
        information.setRunLocation("cn.liupeng.controller.WaiterLandingController");
        information.setRunfunction("获取所有服务员的登陆记录");
        information.setRunFunctionName("listWaiterLanding() ");
        information.setHasReturnObject(true);
        information.setObjectType("List<Waiter_landing>");
        information.setObject(list);
        ModelAndView modelAndView = new ModelAndView(TheGlobalVariable.ALLWAITERLANDINGRECORDPAGE);
        modelAndView.addObject("returnInformation", information);
        return modelAndView;
    }

    /**
     * 通过服务员ID获取服务员的登陆记录
     * @param waiter_id
     * @return
     */
    @RequestMapping(path = "/getWaiterLandingRecord")
    public ModelAndView getWaiterLandingRecord(String waiter_id) {
        Waiter waiter = new Waiter();
        waiter.setWaiter_id(waiter_id);
        List<Waiter_landing> list = this.waiter_landingMapper.getWaitterLandingRecord(waiter);
        Information information = new Information();
        information.setRunLocation("cn.liupeng.controller.WaiterLandingController");
        information.setRunfunction("通过服务员ID获取服务员的登陆记录");
        information.setRunFunctionName("getWaiterLandingRecord() ");
        information.setHasReturnObject(true);
        information.setObjectType("List<Waiter_landing>");
        information.setObject(list);
        ModelAndView modelAndView = new ModelAndView(TheGlobalVariable.ALLWAITERLANDINGRECORDPAGE);
        modelAndView.addObject("returnInformation", information);
        return modelAndView;
    }

}
