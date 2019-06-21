package cn.liupeng.tools;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheakPasswordToolTest {

    private CheakPasswordTool cheakPasswordTool = null;

    private String strPassword = "123Lp";

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

    @Before
    public void setUp() throws Exception {
        this.cheakPasswordTool = new CheakPasswordTool(this.getStrPassword());
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
    }

    @Test
    public void setKey() {
    }

    @Test
    public void cheak() {
    }
}