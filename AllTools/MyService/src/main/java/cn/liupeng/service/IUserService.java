package cn.liupeng.service;

import cn.liupeng.model.User;
import cn.liupeng.service.base.IBaseService;

public interface IUserService extends IBaseService<User> {

    // 特有的方法
    public User login(String userName, String passwordValue) ;


}
