package cn.liupeng.tools.User;

import java.util.UUID;

public class CreateUser_ID {

    private String user_id;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * 获取用户ID
     */
    public void cteateUser_id() {
        String user_id = UUID.randomUUID().toString().replace("-", "");
        user_id = user_id.substring(user_id.length()-20, user_id.length()-1);
        this.setUser_id(user_id);
    }

    public CreateUser_ID(String user_id) {
        this.user_id = user_id;
    }

    public CreateUser_ID() {
        this.cteateUser_id();
    }
}
