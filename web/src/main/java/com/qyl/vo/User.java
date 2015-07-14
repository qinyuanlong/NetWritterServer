package com.qyl.vo;

import com.sun.istack.internal.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by qinyuanlong on 15/7/9.
 */
public class User {

    @NotEmpty(message = "bunengweikong")
    private String id;
    @NotEmpty
    @Email
    private String userName;
    private String password;
    private String nick;
    private Timestamp createAt = new Timestamp(new Date().getTime());
    private Timestamp updateAt = new Timestamp(new Date().getTime());

    public Timestamp getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }


}
