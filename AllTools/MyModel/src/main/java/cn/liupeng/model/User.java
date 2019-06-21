package cn.liupeng.model;

/**
 * @author liupeng
 */
public class User {

    private int user_id;

    private String user_name;

    private String user_password_value;

    private String user_registered_time;

    private String user_registered_ip_adress;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password_value() {
        return user_password_value;
    }

    public void setUser_password_value(String user_password_value) {
        this.user_password_value = user_password_value;
    }

    public String getUser_registered_time() {
        return user_registered_time;
    }

    public void setUser_registered_time(String user_registered_time) {
        this.user_registered_time = user_registered_time;
    }

    public String getUser_registered_ip_adress() {
        return user_registered_ip_adress;
    }

    public void setUser_registered_ip_adress(String user_registered_ip_adress) {
        this.user_registered_ip_adress = user_registered_ip_adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_password_value='" + user_password_value + '\'' +
                ", user_registered_time='" + user_registered_time + '\'' +
                ", user_registered_ip_adress='" + user_registered_ip_adress + '\'' +
                '}';
    }
}


/*
private String userName;

    private String userID;

    private int passwordValue;

    private String registeredDate;

    private double money;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public int getPasswordValue() {
        return passwordValue;
    }

    public void setPasswordValue(int passwordValue) {
        this.passwordValue = passwordValue;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userID='" + userID + '\'' +
                ", passwordValue=" + passwordValue +
                ", registeredDate='" + registeredDate + '\'' +
                ", money=" + money +
                '}';
    }
 */