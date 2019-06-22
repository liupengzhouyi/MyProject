package cn.liupeng.model;

public class Waiter {

    private String waiter_id;

    private String waiter_name;

    private String waiter_password_value;

    private String waiter_registered_time;

    private String waiter_registered_ip_adress;


    public String getWaiter_id() {
        return waiter_id;
    }

    public void setWaiter_id(String waiter_id) {
        this.waiter_id = waiter_id;
    }

    public String getWaiter_name() {
        return waiter_name;
    }

    public void setWaiter_name(String waiter_name) {
        this.waiter_name = waiter_name;
    }

    public String getWaiter_password_value() {
        return waiter_password_value;
    }

    public void setWaiter_password_value(String waiter_password_value) {
        this.waiter_password_value = waiter_password_value;
    }

    public String getWaiter_registered_time() {
        return waiter_registered_time;
    }

    public void setWaiter_registered_time(String waiter_registered_time) {
        this.waiter_registered_time = waiter_registered_time;
    }

    public String getWaiter_registered_ip_adress() {
        return waiter_registered_ip_adress;
    }

    public void setWaiter_registered_ip_adress(String waiter_registered_ip_adress) {
        this.waiter_registered_ip_adress = waiter_registered_ip_adress;
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "waiter_id=" + waiter_id +
                ", waiter_name='" + waiter_name + '\'' +
                ", waiter_password_value='" + waiter_password_value + '\'' +
                ", waiter_registered_time='" + waiter_registered_time + '\'' +
                ", waiter_registered_ip_adress='" + waiter_registered_ip_adress + '\'' +
                '}';
    }
}
