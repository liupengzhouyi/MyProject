package cn.liupeng.service;

import cn.liupeng.mapper.Waiter_landingMapper;
import cn.liupeng.model.Waiter;
import cn.liupeng.model.Waiter_landing;
import cn.liupeng.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Waiter_landingServiceImpl extends BaseServiceImpl<Waiter_landing> implements IWaiter_landingService {

    /**
     * 统一管理添加服务员登陆的记录
     */
    @Autowired
    protected Waiter_landingMapper waiter_landingMapper;

    /**
     * record
     * @param waiter
     * @return
     */
    @Override
    public List<Waiter_landing> getWaiterLanding(Waiter waiter) {
        return this.waiter_landingMapper.getWaitterLandingRecord(waiter);
    }

    /**
     * 添加服务员登陆记录
     * @param waiter_landing
     */
    @Override
    public void insert(Waiter_landing waiter_landing) {
        this.waiter_landingMapper.addLandingRecord(waiter_landing);
    }

    @Override
    public void deleteByID(Integer id) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void update(Waiter_landing waiter_landing) {

    }

    /**
     * 获取所有服务员的登陆的记录
     * @return
     */
    @Override
    public List<Waiter_landing> select() {
        return this.waiter_landingMapper.getAllWaiterLandingRecord();
    }


    @Override
    public Waiter_landing selectByID(Integer id) {
        return null;
    }


    @Override
    public Waiter_landing selectByUUID(String uuid) {
        return null;
    }
}
