package cn.liupeng.controller;

import cn.liupeng.model.User;
import cn.liupeng.model.Waiter;
import cn.liupeng.model.Waiter_landing;
import cn.liupeng.service.IWaiterService;
import cn.liupeng.tools.DateTime.GetDateTime;
import cn.liupeng.tools.IPAdress.IPAdress;
import cn.liupeng.tools.Password.CheakPasswordTool;
import cn.liupeng.tools.Password.PasswordToPasswordValue;
import cn.liupeng.tools.Return.Information;
import cn.liupeng.tools.TheGlobalVariable;
import cn.liupeng.tools.User.CreateUser_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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


    /**
     * 服务员登陆
     * @param waiter_id
     * @param waiter_password
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @RequestMapping(path = "/landing")
    public String landing(String waiter_id, String waiter_password, HttpServletRequest httpServletRequest) throws Exception {
        String returnValue = null;
        boolean key = false;
        // ------------------------------------------------------------------------------------------------
        Waiter_landing waiter_landing = new Waiter_landing();
        waiter_landing.setWaiter_id(waiter_id);
        waiter_landing.setWaiter_landing_time(new GetDateTime().getDateTime());
        String waiter_landing_ip_adress = new IPAdress(httpServletRequest).getIpAdress();
        waiter_landing.setWaiter_landing_ip_adress(waiter_landing_ip_adress);
        // ------------------------------------------------------------------------------------------------
        String returnInformation = null;
        String page = "";
        if ("".equals(waiter_id) || "".equals(waiter_password)) {
            // 填写内容不全
            returnInformation = TheGlobalVariable.NOTENOUGHLANDINGINFORMATION;
        } else {
            // 开始操作
            String waiter_password_value = new PasswordToPasswordValue(waiter_password).getPasswordVlaue() + "";
            Waiter waiter = new Waiter(waiter_id, waiter_password_value);
            String waiter_registered_ip_adress = new IPAdress(httpServletRequest).getIpAdress();
            waiter.setWaiter_registered_ip_adress(waiter_registered_ip_adress);
            key = this.waiterService.landing(waiter);
        }
        if (key) {
            waiter_landing.setWaiter_landing_result(1);
            page = TheGlobalVariable.SUCCESSS;
        } else {
            waiter_landing.setWaiter_landing_result(0);
            page = TheGlobalVariable.ERROR;
        }
        returnValue = TheGlobalVariable.ADDWAITERLANDINGRRECORDPAGE;
        addWaiterLanding(httpServletRequest, page, waiter_landing);
        System.out.println(waiter_landing);
        System.out.println("returnValue" + returnValue);
        return returnValue;
    }

    /**
     * 服务员登陆中在表中添加数据
     * 1。 登陆记录
     * 2。 转发页面
     * @param httpServletRequest
     */
    public void addWaiterLanding(HttpServletRequest httpServletRequest, String page, Waiter_landing waiter_landing) {
        HttpSession httpSession = httpServletRequest.getSession();
        httpSession.setAttribute("page", page);
        httpSession.setAttribute("waiter_landing", waiter_landing);
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


    /**
     * 获取所有的服务员信息
     * @return
     */
    @RequestMapping(path = "/allWaiter")
    public ModelAndView allWaiter() {
        List<Waiter> list = this.waiterService.select();
        Information information = new Information();
        information.setRunLocation("cn.liupeng.controller.WaiterController");
        information.setRunFunctionName("获取所有服务员信息");
        information.setRunFunctionName("allWaiter()");
        information.setHasReturnObject(true);
        information.setObjectType("List<Waiter>");
        information.setObject(list);
        String returnInformation;
        if (list.size() > 0) {
            returnInformation = "获取到信息";
        } else {
            returnInformation = "没有获取到信息";
        }
        information.setReturnInformation(returnInformation);
        ModelAndView modelAndView = new ModelAndView(TheGlobalVariable.ALLWAITERINFORMATION);
        modelAndView.addObject("returnInformation", information);
        modelAndView.addObject("listLength", list.size());
        return modelAndView;
    }

    /**
     * 通过服务员ID查找服务员信息
     * @return
     */
    @RequestMapping(path = "/findWaiterByID")
    public ModelAndView findWaiterByID(String waiter_id) {
        Waiter waiter = this.waiterService.selectByUUID(waiter_id);
        Information information = new Information();
        information.setRunLocation("cn.liupeng.controller.WaiterController");
        information.setRunFunctionName("通过服务员ID获取服务员信息");
        information.setRunFunctionName("findWaiterByID");
        information.setHasReturnObject(true);
        information.setObjectType("Waiter");
        information.setObject(waiter);
        String returnInformation;
        if (waiter.equals(null)) {
            returnInformation = "没有获取到信息";
        } else {
            returnInformation = "获取到信息";
        }
        information.setReturnInformation(returnInformation);
        System.out.println(information);
        ModelAndView modelAndView = new ModelAndView(TheGlobalVariable.FINDONEWAITER);
        modelAndView.addObject("returnInformation", information);
        return modelAndView;
    }

    /**
     * 校验旧密码
     * @param waiter_id
     * @param waiter_password
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @RequestMapping(path = "/checkOldPassword")
    public ModelAndView checkOldPassword(String waiter_id, String waiter_password, HttpServletRequest httpServletRequest) throws Exception {
        // 开始操作
        boolean key = false;
        String waiter_password_value = new PasswordToPasswordValue(waiter_password).getPasswordVlaue() + "";
        Waiter waiter = new Waiter(waiter_id, waiter_password_value);
        String waiter_registered_ip_adress = new IPAdress(httpServletRequest).getIpAdress();
        waiter.setWaiter_registered_ip_adress(waiter_registered_ip_adress);
        key = this.waiterService.landing(waiter);
        String checkInformation = "";
        String returnPage = "";
        if (key) {
            // 用户ID与密码校验没有问题
            checkInformation = TheGlobalVariable.RIGHTIDORPASSWORD;
            returnPage = TheGlobalVariable.WAITERINPUTNEWPASSWORD;
            // 添加Session 中添加服务员的ID
            HttpSession httpSession = httpServletRequest.getSession();
            httpSession.setAttribute("waiter_id", waiter.getWaiter_id());
        } else {
            // 用户名或者密码错误
            checkInformation = TheGlobalVariable.ERROEIDORPASSWORD;
            returnPage = TheGlobalVariable.WAITERERRORPAGE;
        }
        Information information = new Information();
        information.setRunLocation("cn.liupeng.controller.WaiterController");
        information.setRunfunction("服务员修改密码，校验ID和密码是否合法和配套");
        information.setRunFunctionName("checkOldPassword(String waiter_id, String waiter_password, HttpServletRequest httpServletRequest)");
        information.setHasReturnObject(false);
        information.setReturnInformation(checkInformation);
        //System.out.println(information);
        ModelAndView modelAndView = new ModelAndView(returnPage);
        return modelAndView;
    }

    /**
     * 修改新的密码
     * @param waiter_password
     * @param waiter_confirm_password
     * @param httpServletRequest
     * @ret###urn
     */
    @RequestMapping(path = "/resetPassword")
    public ModelAndView resetPassword(String waiter_password, String waiter_confirm_password, HttpServletRequest httpServletRequest) {
        HttpSession httpSession = httpServletRequest.getSession();
        String waiter_id = (String) httpSession.getAttribute("waiter_id");
        CheakPasswordTool cheakPasswordTool = new CheakPasswordTool(waiter_password, waiter_confirm_password);
        Information information = new Information();
        String returnPage = "";
        if (cheakPasswordTool.isKey()) {
            // 密码合法
            //密码转换为密码值
            PasswordToPasswordValue passwordToPasswordValue = new PasswordToPasswordValue(waiter_password);
            String waiter_password_value = passwordToPasswordValue.getPasswordVlaue() + "";
            Waiter waiter = new Waiter();
            waiter.setWaiter_id(waiter_id);
            waiter.setWaiter_password_value(waiter_password_value);
            // 开始修改密码
            this.waiterService.resetWaiterPassword(waiter);
            returnPage = TheGlobalVariable.WAITERSUCCESSPAGE;
            information.setRunfunction("服务员修改密码成功");
            information.setReturnInformation(TheGlobalVariable.WAITERRESETPASSWORDSUCCESS);
        } else {
            // 密码出现了问题，操！
            returnPage = TheGlobalVariable.WAITERERRORPAGE;
            information.setRunfunction("服务员修改密码.校验新密码");
            information.setReturnInformation(cheakPasswordTool.getReturnInformation());
        }
        information.setRunLocation("cn.liupeng.controller.WaiterController");
        information.setRunFunctionName("resetPassword(String waiter_password, String waiter_confirm_password, HttpServletRequest httpServletRequest)");
        information.setHasReturnObject(false);
        System.out.println(information);
        ModelAndView modelAndView = new ModelAndView(returnPage);
        modelAndView.addObject("returnInformation", information);
        return modelAndView;
    }


    /**
     * 校验用户数据的用户名与密码
     * @param waiter_id
     * @param waiter_password
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @RequestMapping(path = "/verifyIDAndPassword")
    public ModelAndView verifyIDAndPassword(String waiter_id, String waiter_password, HttpServletRequest httpServletRequest) throws Exception {
        // 开始操作
        boolean key = false;
        String waiter_password_value = new PasswordToPasswordValue(waiter_password).getPasswordVlaue() + "";
        Waiter waiter = new Waiter(waiter_id, waiter_password_value);
        String waiter_registered_ip_adress = new IPAdress(httpServletRequest).getIpAdress();
        waiter.setWaiter_registered_ip_adress(waiter_registered_ip_adress);
        key = this.waiterService.landing(waiter);
        String checkInformation = "";
        String returnPage = "";
        if (key) {
            // 用户ID与密码校验没有问题
            checkInformation = TheGlobalVariable.RIGHTIDORPASSWORD;
            returnPage = TheGlobalVariable.INPUTNEWNAME;
            // 添加Session 中添加服务员的ID
            HttpSession httpSession = httpServletRequest.getSession();
            httpSession.setAttribute("waiter_id", waiter.getWaiter_id());
        } else {
            // 用户名或者密码错误
            checkInformation = TheGlobalVariable.ERROEIDORPASSWORD;
            returnPage = TheGlobalVariable.WAITERERRORPAGE;
        }
        Information information = new Information();
        information.setRunLocation("cn.liupeng.controller.WaiterController");
        information.setRunfunction("服务员修改用户名，校验ID和密码是否合法和配套");
        information.setRunFunctionName("checkOldPassword(String waiter_id, String waiter_password, HttpServletRequest httpServletRequest)");
        information.setHasReturnObject(false);
        information.setReturnInformation(checkInformation);
        //System.out.println(information);
        ModelAndView modelAndView = new ModelAndView(returnPage);
        modelAndView.addObject("returnInformation", information);
        return modelAndView;
    }

    /**
     * 修改服务员用户名
     * @param waiter_name
     * @param httpServletRequest
     * @return
     * @throws Exception
     */
    @RequestMapping(path = "/resetName")
    public ModelAndView resetName(String waiter_name, HttpServletRequest httpServletRequest) throws Exception {
        HttpSession httpSession = httpServletRequest.getSession();
        String returnInformation = "";
        Information information = new Information();
        information.setRunLocation("cn.liupeng.controller.WaiterController");
        information.setRunFunctionName("resetName(String waiter_name, HttpServletRequest httpServletRequest)");
        information.setRunfunction("修改服务员密码");
        information.setHasReturnObject(false);
        String waiter_id = (String) httpSession.getAttribute("waiter_id");
        Waiter waiter = new Waiter();
        waiter.setWaiter_name(waiter_name);
        waiter.setWaiter_id(waiter_id);
        if ("".equals(waiter.getWaiter_name())) {
            // 没有输入用户名
            information.setReturnInformation(TheGlobalVariable.NONAME);
        } else {
            // 开始与数据库交互修改用户民
            information.setReturnInformation("修改服务员用户名成功");
            this.waiterService.resetWaiterName(waiter);
        }
        ModelAndView modelAndView = new ModelAndView(TheGlobalVariable.RESETWAITERNAMESUCCESS);
        modelAndView.addObject("returnInformation", information);
        return modelAndView;
    }

}
