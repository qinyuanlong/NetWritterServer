package com.qyl.vo;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by qinyuanlong on 15/7/9.
 */
public class User extends BaseVo{

    @NotEmpty
    @Email
    private String mail;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
