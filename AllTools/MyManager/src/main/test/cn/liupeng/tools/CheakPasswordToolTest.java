package cn.liupeng.tools;

import cn.liupeng.tools.Password.CheakPasswordTool;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheakPasswordToolTest {

    private CheakPasswordTool cheakPasswordTool = null;

    private String strPassword = "123Lp";

    private String user_confirm_password = "123Lp";

    public CheakPasswordTool getCheakPasswordTool() {
        return cheakPasswordTool;
    }

    public void setCheakPasswordTool(CheakPasswordTool cheakPasswordTool) {
        this.cheakPasswordTool = cheakPasswordTool;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPpassword) {
        this.strPassword = strPpassword;
    }

    public String getUser_confirm_password() {
        return user_confirm_password;
    }

    public void setUser_confirm_password(String user_confirm_password) {
        this.user_confirm_password = user_confirm_password;
    }

    @Before
    public void setUp() throws Exception {
        this.cheakPasswordTool = new CheakPasswordTool(this.getStrPassword(), this.getUser_confirm_password());
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getPassword() {
    }

    @Test
    public void setPassword() {
    }

    @Test
    public void isKey() {
        System.out.println(this.getCheakPasswordTool().isKey());
        System.out.println(this.getCheakPasswordTool().getReturnInformation());
    }

    @Test
    public void setKey() {
    }

    @Test
    public void cheak() {
    }
}