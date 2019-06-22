package cn.liupeng.mapper;

import cn.liupeng.model.Waiter;

import java.util.List;

public interface WaiterMapper {

    /**
     * 添加服务员
     * @param waiter
     */
    public void addWaiter(Waiter waiter);

    /**
     * 通过编号删除服务员
     * @param waiter_number
     */
    public void deleteWaiterByNumber(Integer waiter_number);

    /**
     * 通过ID删除服务员
     * @param waiter_id
     */
    public void deleteWaiterByID(String waiter_id);

    /**
     * 更新服务员
     * @param waiter
     */
    public void updateWaiter(Waiter waiter);

    /**
     * 获取所有服务员
     * @return
     */
    public List<Waiter> listWaiter();

    /**
     * 通过服务员编号获取服务员
     * @param waiter_id
     * @return
     */
    public Waiter findWaiterByNumber(Integer waiter_id);

    /**
     * 通过服务员ID获取服务员信息
     * @param waiter_id
     * @return
     */
    public Waiter findWaiterByID(String waiter_id);

    /**
     * 通过服务员ID获取密码
     * @param waiter_id
     * @return
     */
    public String getWaiterPasswordValueByID(String waiter_id);
}
