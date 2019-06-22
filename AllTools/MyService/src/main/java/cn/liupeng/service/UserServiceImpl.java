package cn.liupeng.service;

import cn.liupeng.model.User;
import cn.liupeng.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liupeng
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {

    @Override
    public User login(String userName, String passwordValue) {
        return null;
    }

    /**
     * 用户注册
     * @param user
     */
    @Override
    public void registration(User user) {
        this.userMapper.addUser(user);
    }

    /**
     * 获取所有用户
     * @return
     */
    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }

    @Override
    public void insert(User user) {

    }

    @Override
    public void deleteByID(Integer id) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User select() {
        return null;
    }

    /**
     * 通过ID查找用户
     * @param id
     * @return
     */
    @Override
    public User selectByID(Integer id) {
        return this.userMapper.findUser(id);
    }

    /**
     * 通过UUID查找用户
     * @param uuid
     * @return
     */
    @Override
    public User selectByUUID(String uuid) {
        return this.userMapper.findUserByUUID(uuid);
    }
}
