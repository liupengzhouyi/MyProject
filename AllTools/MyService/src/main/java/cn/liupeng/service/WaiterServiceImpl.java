package cn.liupeng.service;

import cn.liupeng.mapper.WaiterMapper;
import cn.liupeng.model.Waiter;
import cn.liupeng.service.IWaiterService;
import cn.liupeng.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liupeng
 */
@Service
public class WaiterServiceImpl extends BaseServiceImpl<Waiter> implements IWaiterService {

    /**
     * 统一管理 服务员 DAO
     */
    @Autowired
    protected WaiterMapper waiterMapper;

    /**
     * 服务员登陆是否成功
     * ------------------------------------------------------------------
     * 获取用户输入的服务员ID，密码值
     * 用户服务员ID获取数据库中的密码值
     * 匹配俩个密码值是否一致
     * 如果一致：登陆成功
     * 如果不一致：登陆不成功
     * @param waiter
     * @return
     */
    @Override
    public boolean landing(Waiter waiter) {
        boolean retuanValue = false;
        System.out.println("校验密码：" + waiter);
        String db_waiter_passsword_value = this.waiterMapper.getWaiterPasswordValueByID(waiter.getWaiter_id());
        if (waiter.getWaiter_password_value().equals(db_waiter_passsword_value)) {
            retuanValue = true;
        } else {
            retuanValue = false;
        }
        return retuanValue;
    }

    /**
     * 修改密码
     * @param waiter
     */
    @Override
    public void resetWaiterPassword(Waiter waiter) {
        this.waiterMapper.updateWaiterPassword(waiter);
    }

    /**
     * 服务员注册
     * 把服务员实体 通过 DAO 层 保存到数据库中
     * @param waiter
     */
    @Override
    public void insert(Waiter waiter) {
        this.waiterMapper.addWaiter(waiter);
    }

    /**
     * 服务员删除
     * 通过注册编号 把服务员 通过 DAO 层 在数据库中删除
     * @param id
     */
    @Override
    public void deleteByID(Integer id) {
        this.waiterMapper.deleteWaiterByNumber(id);
    }

    /**
     * 服务员删除
     * 通过 用户ID 把服务员 通过 DAO 层 在数据库中删除
     * @param uuid
     */
    @Override
    public void deleteByUUID(String uuid) {
        this.waiterMapper.deleteWaiterByID(uuid);
    }

    /**
     * 更新服务员信息
     * @param waiter
     */
    @Override
    public void update(Waiter waiter) {
        this.waiterMapper.updateWaiter(waiter);
    }

    /**
     * 获取所有服务员信息
     * @return
     */
    @Override
    public List<Waiter> select() {
        return this.waiterMapper.listWaiter();
    }

    /**
     * 通过服务员注册编号查找服务员
     * @param id
     * @return
     */
    @Override
    public Waiter selectByID(Integer id) {
        Waiter waiter = this.waiterMapper.findWaiterByNumber(id);
        return waiter;
    }

    /**
     * 通过服务员ID查找服务员
     * @param uuid
     * @return
     */
    @Override
    public Waiter selectByUUID(String uuid) {
        Waiter waiter = this.waiterMapper.findWaiterByID(uuid);
        //System.out.println(waiter);
        return waiter;
    }
}
