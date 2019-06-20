package cn.liupeng.model;

public class User {

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
}
