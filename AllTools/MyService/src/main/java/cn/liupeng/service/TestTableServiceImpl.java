package cn.liupeng.service;

import cn.liupeng.model.TestTable;
import cn.liupeng.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestTableServiceImpl extends BaseServiceImpl<TestTable> implements ITestTableService {

    /**
     * 获取所有
     * @return
     */
    @Override
    public List<TestTable> listTest() {
        return testTableMapper.listTest();
    }

    /**
     * 添加
     * @param testTable
     */
    @Override
    public void insert(TestTable testTable) {
        testTableMapper.insert(testTable);
    }

    @Override
    public void deleteByID(Integer id) {

    }

    @Override
    public void deleteByUUID(String uuid) {

    }

    @Override
    public void update(TestTable testTable) {

    }

    @Override
    public TestTable select() {
        return null;
    }

    @Override
    public TestTable selectByID(Integer id) {
        return null;
    }

    @Override
    public TestTable selectByUUID(String uuid) {
        return null;
    }
}
