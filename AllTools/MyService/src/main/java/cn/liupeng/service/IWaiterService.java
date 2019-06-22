package cn.liupeng.service;

import cn.liupeng.mapper.WaiterMapper;
import cn.liupeng.model.Waiter;
import cn.liupeng.service.base.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liupeng
 */
public interface IWaiterService extends IBaseService<Waiter> {

    /**
     * 校验用户是否可以的登陆
     * @param waiter
     * @return
     */
    public boolean landing(Waiter waiter);
}
