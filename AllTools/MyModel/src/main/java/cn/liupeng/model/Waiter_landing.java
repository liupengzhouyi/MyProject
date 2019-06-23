package cn.liupeng.model;

public class Waiter_landing {


    private String waiter_id;

    private int waiter_landing_result;

    private String waiter_landing_time;

    private String waiter_landing_ip_adress;

    public String getWaiter_id() {
        return waiter_id;
    }

    public void setWaiter_id(String waiter_id) {
        this.waiter_id = waiter_id;
    }

    public int getWaiter_landing_result() {
        return waiter_landing_result;
    }

    public void setWaiter_landing_result(int waiter_landing_result) {
        this.waiter_landing_result = waiter_landing_result;
    }

    public String getWaiter_landing_time() {
        return waiter_landing_time;
    }

    public void setWaiter_landing_time(String waiter_landing_time) {
        this.waiter_landing_time = waiter_landing_time;
    }

    public String getWaiter_landing_ip_adress() {
        return waiter_landing_ip_adress;
    }

    public void setWaiter_landing_ip_adress(String waiter_landing_ip_adress) {
        this.waiter_landing_ip_adress = waiter_landing_ip_adress;
    }

    @Override
    public String toString() {
        return "Waiter_landing{ waiter_id='" + waiter_id + '\'' +
                ", waiter_landing_result=" + waiter_landing_result +
                ", waiter_landing_time='" + waiter_landing_time + '\'' +
                ", waiter_landing_ip_adress='" + waiter_landing_ip_adress + '\'' +
                '}';
    }
}
