package cn.liupeng.mapper;

import cn.liupeng.model.Waiter;

import java.util.List;

public interface Waiter_landingMapper {

    /**
     * 添加某一条登陆记录
     * @param waiter_landing
     */
    public void addLandingRecord(cn.liupeng.model.Waiter_landing waiter_landing);

    /**
     * 获取所有的登陆记录
     */
    public List<cn.liupeng.model.Waiter_landing> getAllWaiterLandingRecord();

    /**
     * 获取某一个服务员的登陆记录
     * @param waiter
     * @return
     */
    public List<cn.liupeng.model.Waiter_landing> getWaitterLandingRecord(Waiter waiter);



}
