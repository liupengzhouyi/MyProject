package cn.liupeng.tools;

public class CheakPasswordTool {

    private String password;

    private boolean key;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public void cheak() {
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
        } else {
            this.setKey(false);
        }
    }


    public CheakPasswordTool(String password) {
        this.setPassword(password);
        this.cheak();
    }

}
