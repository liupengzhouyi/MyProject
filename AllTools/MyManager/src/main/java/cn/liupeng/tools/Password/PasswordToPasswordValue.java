package cn.liupeng.tools.Password;

/**
 * @author liupeng
 */
public class PasswordToPasswordValue {

    private String password;

    private int passwordVlaue;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPasswordVlaue() {
        return passwordVlaue;
    }

    /**
     * 密码设置为密码值
     */
    public void setPasswordVlaue() {
        this.passwordVlaue = this.getPassword().hashCode();
        this.passwordVlaue = this.passwordVlaue + 5;
    }

    /**
     * 构造函数s
     * @param password
     */
    public PasswordToPasswordValue(String password) {
        this.setPassword(password);
        this.setPasswordVlaue();
    }
}
