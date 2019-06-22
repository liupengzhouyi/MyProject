package cn.liupeng.tools.Return;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InformationTest {

    private Information information;

    public Information getInformation() {
        return information;
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    @Before
    public void setUp() throws Exception {
        this.information = new Information();
        information.setRunLocation("cn.liupeng.tools.Return.Information");
        information.setRunFunctionName("setUp()");
        information.setRunfunction("测试");
        information.setHasReturnObject(false);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void toString1() {
        System.out.println(this.getInformation());
    }
}