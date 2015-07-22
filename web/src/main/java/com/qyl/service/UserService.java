package com.qyl.service;

import com.qyl.comm.mail.MailHelper;
import com.qyl.exception.user.UserExistException;
import com.qyl.mapper.UserMapper;
import com.qyl.service.interfaces.IUserService;
import com.qyl.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by qinyuanlong on 15/7/9.
 */
@Service
public class UserService implements IUserService{

    @Autowired
    private UserMapper userMapper;

    public void register(User user) throws UserExistException{
        int userCount = userMapper.find(user.getMail());
        if(userCount > 0){
            throw new UserExistException();
        }
        userMapper.add(user);
        MailHelper.sendRegisterSuccess(user.getMail());
    }

    /**
     * TODO:服务端记录用户登录信息
     *
     * @param user
     * @return
     */
    public int login(User user){
        return userMapper.login(user);
    }

}
