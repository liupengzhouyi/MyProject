package cn.liupeng.service;

import cn.liupeng.model.User;
import cn.liupeng.service.base.IBaseService;

import java.util.List;

public interface IUserService extends IBaseService<User> {

    // 特有的方法
    public User login(String userName, String passwordValue) ;

    // 用户注册
    public void registration (User user);

    /**
     * 获取所有用户
     * @return
     */
    public List<User> listUser();

}
