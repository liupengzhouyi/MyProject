package cn.liupeng.service;

import cn.liupeng.model.TestTable;
import cn.liupeng.service.base.IBaseService;

import java.util.List;

public interface ITestTableService extends IBaseService<TestTable> {

    public List<TestTable> listTest();



}
