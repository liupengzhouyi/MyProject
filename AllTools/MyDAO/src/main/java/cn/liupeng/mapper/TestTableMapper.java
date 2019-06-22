package cn.liupeng.mapper;

import cn.liupeng.model.TestTable;

import java.util.List;

public interface TestTableMapper {

    /**
     * 获取所有用户
     * @return
     */
    public List<TestTable> listTest();


    /**
     * 添加
     * @param testTable
     */
    public void insert(TestTable testTable);

}
