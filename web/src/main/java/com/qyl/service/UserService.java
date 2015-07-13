package com.qyl.service;

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

    public void addUser(User user){

        userMapper.add(user);
    }

}
