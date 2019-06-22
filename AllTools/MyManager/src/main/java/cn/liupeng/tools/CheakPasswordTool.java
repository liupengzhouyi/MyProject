package cn.liupeng.tools;

/**
* @Description: 校验密码
* @Author: liupeng/刘鹏
* @Date:  2019-06-22
*/
public class CheakPasswordTool {

    private String password;

    private String user_confirm_password;

    private boolean key;

    private String returnInformation;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_confirm_password() {
        return user_confirm_password;
    }

    public void setUser_confirm_password(String user_confirm_password) {
        this.user_confirm_password = user_confirm_password;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public String getReturnInformation() {
        return returnInformation;
    }

    public void setReturnInformation(String returnInformation) {
        this.returnInformation = returnInformation;
    }

    /**
     * 校验密码长度
     */
    public void passwordLength() {
        if (this.getPassword().length() < 6) {
            this.setKey(true);
            this.setReturnInformation(TheGlobalVariable.SUCCESSPASSWORD);
        } else {
            this.setKey(false);
            this.setReturnInformation(TheGlobalVariable.PASSWORDTOOSHORT);
        }
    }

    /**
     * 校验密码一致性
     */
    public void smaePassword() {
        if (this.getPassword().equals(this.getUser_confirm_password())) {
            this.setKey(true);
            this.setReturnInformation(TheGlobalVariable.SUCCESSPASSWORD);
        } else {
            this.setKey(false);
            this.setReturnInformation(TheGlobalVariable.PASSWORDDIFFERENT);
        }
    }

    /**
     * 校验密码复杂度
     */
    public void cheakComplexity() {
        int a = 0;
        int A = 0;
        int a0 = 0;
        char[] chars = this.getPassword().toCharArray();
        for (int i=0;i<chars.length;i++) {
            if (chars[i] <= 'z' && chars[i] >= 'a') {
                a = 1;
            } else if (chars[i] <= '9' && chars[i] >= '0') {
                a0 = 1;
            } else if (chars[i] <= 'Z' && chars[i] >= 'A') {
                A = 1;
            }
        }
        int number = a + a0 + A;
        if (number == 3) {
            this.setKey(true);
            this.setReturnInformation(TheGlobalVariable.SUCCESSPASSWORD);
        } else {
            this.setKey(false);
            this.setReturnInformation(TheGlobalVariable.PASSSWORDTOOSIMPLE);
        }
    }

    public CheakPasswordTool(String password, String user_confirm_password) {
        this.setPassword(password);
        this.setUser_confirm_password(user_confirm_password);
        //校验密码一致性
        this.smaePassword();
        if (this.isKey()) {
            //校验密码复杂度
            this.cheakComplexity();
            if (this.isKey()) {
                //校验密码长度
                this.passwordLength();
            }
        }
    }



}
