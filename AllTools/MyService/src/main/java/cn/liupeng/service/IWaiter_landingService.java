package cn.liupeng.service;

import cn.liupeng.model.Waiter;
import cn.liupeng.model.Waiter_landing;
import cn.liupeng.service.base.IBaseService;

import java.util.List;

public interface IWaiter_landingService extends IBaseService<Waiter_landing> {

    /**
     * 获取某一个服务员的所有登陆记录
     * @param waiter
     * @return
     */
    public List<Waiter_landing> getWaiterLanding(Waiter waiter);


}
