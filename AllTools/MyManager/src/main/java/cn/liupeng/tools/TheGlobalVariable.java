package cn.liupeng.tools;

import javax.sql.rowset.serial.SerialStruct;

public class TheGlobalVariable {

    // 密码太短
    public static String PASSWORDTOOSHORT = "The password is too short";

    //密码太简单
    public static String PASSSWORDTOOSIMPLE = "Password too simple";

    //密码不一致
    public static String PASSWORDDIFFERENT = "Password different";

    //密码不合法
    public static String PASSWORDILLEGAL = "Password illegal";

    //合法的密码
    public static String SUCCESSPASSWORD = "success";

    //没有输入用户名
    public static String NOUSERNAME = "not input user name";

    // 成功
    public static String SUCCESSS = "success";

    // 错误
    public static String ERROR = "error";

    // 服务员注册
    public static String WAITERREGISTRATION = "waiterRegistration";

    // 服务员登陆
    public static String WAITERLANDING = "waiterLanding";

    // 登陆信息不全，用户ID或者密码没有输入
    public static String NOTENOUGHLANDINGINFORMATION = "not enough landing information, no user ID or passsword";

    // 用户ID或者密码输入错误
    public static String ERROELANDINGINFORMATION = "user ID or password was error（用户名或者密码错误）";

    // 获取所有服务员信息
    public static String ALLWAITERINFORMATION = "waiter/allWaiterInformation";

    // 获取一个服务员信息
    public static String FINDONEWAITER = "waiter/findWaiter";

    //转向 用ID 查询 服务员页面
    public static String FINDWAITERBYID = "waiter/findWaiterFrom";

    // 服务员修改密码，输入旧密码
    public static String WAITERINPUTORDPASSWORD = "waiter/inputOrdPassword";

    //服务员输入新密码，输入新密码
    public static String WAITERINPUTNEWPASSWORD = "waiter/inputNewPassword";

    // 用户ID或者密码输入错误
    public static String ERROEIDORPASSWORD = "ID or password was error（用户名或者密码错误）";

    // 用户ID或者密码输入错误
    public static String RIGHTIDORPASSWORD = "ID and password was right（用户名或者密码正确）";

    // 服务员修改密码错误
    public static String WAITERERRORPAGE = "waiter/error";

    // 服务员修改密码成功-页面
    public static String WAITERSUCCESSPAGE = "waiter/success";

    // 修改密码成功
    public static String WAITERRESETPASSWORDSUCCESS = "reset password success";

    // 所有服务员登陆的记录
    public static String ALLWAITERLANDINGRECORDPAGE = "waiter/allWaiterLandingrecord";

    // 转发到添加服务员登陆页面
    public static String ADDWAITERLANDINGRRECORDPAGE = "redirect:/WaiterLanding/add";

    // 获取要查询的服务员的ID
    public static String SELECTWAITERLANDINGID = "waiter/waiterLandingRecord";



}
