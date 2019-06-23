package cn.liupeng.mapper;

public interface Waiter_landing {

    /**
     * 添加某一条登陆记录
     * @param waiter_landing
     */
    public void addLandingRecord(cn.liupeng.model.Waiter_landing waiter_landing);

    /**
     * 获取所有的登陆记录
     */
    public void getAllWaiterLandingRecord();

    /**
     * 获取某一个服务员的登陆记录
     * @param waiter_landing
     */
    public void getWaitterLandingRecord(cn.liupeng.model.Waiter_landing waiter_landing);



}
