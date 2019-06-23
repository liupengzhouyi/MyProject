package cn.liupeng.service;

import cn.liupeng.mapper.WaiterMapper;
import cn.liupeng.model.Waiter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class WaiterServiceImplTest {

    private WaiterServiceImpl waiterService;

    public WaiterServiceImpl getWaiterService() {
        return waiterService;
    }

    public void setWaiterService(WaiterServiceImpl waiterService) {
        this.waiterService = waiterService;
    }

    @Before
    public void setUp() throws Exception {
        this.waiterService = new WaiterServiceImpl();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void landing() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void deleteByID() {
    }

    @Test
    public void deleteByUUID() {
    }

    @Test
    public void update() {
    }

    @Test
    public void select() {
        List<Waiter> list = this.getWaiterService().waiterMapper.listWaiter();
        for (Waiter waiter:list) {
            System.out.println(waiter);
        }
    }

    @Test
    public void selectByID() {
    }

    @Test
    public void selectByUUID() {
    }
}