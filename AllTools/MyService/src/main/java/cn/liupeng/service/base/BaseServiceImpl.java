package cn.liupeng.service.base;

import cn.liupeng.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liupeng
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    // 统一管理DAO
    @Autowired
    protected UserMapper userMapper;



}
