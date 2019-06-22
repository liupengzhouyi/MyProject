package cn.liupeng.tools.User;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreateUser_IDTestTable {

    private CreateUser_ID createUser_id ;


    public CreateUser_ID getCreateUser_id() {
        return createUser_id;
    }

    public void setCreateUser_id(CreateUser_ID createUser_id) {
        this.createUser_id = createUser_id;
    }

    @Before
    public void setUp() throws Exception {
        this.createUser_id = new CreateUser_ID();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void paly() {
        System.out.println(this.getCreateUser_id().getUser_id());
    }
}