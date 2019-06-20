package cn.liupeng.mapper;

import cn.liupeng.model.User;

import java.util.List;

public interface UserMapper {

    /**
     * 添加用户
     * @param user
     */
    public void addUser(User user);

    /**
     * 通过用户ID删除用户
     * @param id
     */
    public void deleteUser(Integer id);

    /**
     * 更新用户
     * @param user
     */
    public void updateUser(User user);

    /**
     * 获取所有用户
     * @return
     */
    public List<User> listUser();

    /**
     * 通过用户ID查询用户
     * @param id
     * @return
     */
    public User findUser(Integer id);

    /**
     * 通过UUID查询用户
     * @param uuid
     * @return
     */
    public User findUserByUUID(String uuid);

}
