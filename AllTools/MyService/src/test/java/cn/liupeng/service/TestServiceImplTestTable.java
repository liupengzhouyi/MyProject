package cn.liupeng.service;

import cn.liupeng.model.TestTable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestServiceImplTestTable {

    private TestTableServiceImpl testService;

    public TestTableServiceImpl getTestService() {
        return testService;
    }

    public void setTestService(TestTableServiceImpl testService) {
        this.testService = testService;
    }

    @Before
    public void setUp() throws Exception {
        this.testService = new TestTableServiceImpl();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void paly01() {
        TestTable testTable = new TestTable();
        testTable.setUsername("123");
        testTable.setPassword("124");
        this.getTestService().insert(testTable);
    }


}