package com.qyl.service;

import com.qyl.comm.mail.MailHelper;
import com.qyl.exception.UserExistException;
import com.qyl.mapper.UserMapper;
import com.qyl.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by qinyuanlong on 15/7/9.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void registter(User user) throws UserExistException{
        int userCount = userMapper.find(user.getMail());
        if(userCount > 0){
            throw new UserExistException();
        }
        userMapper.add(user);
        MailHelper.sendRegisterSuccess(user.getMail());
    }

    public void addUser(User user){
        userMapper.add(user);
    }

}
