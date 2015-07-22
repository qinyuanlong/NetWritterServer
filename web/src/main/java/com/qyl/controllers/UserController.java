package com.qyl.controllers;

import com.qyl.exception.user.UserExistException;
import com.qyl.service.UserService;
import com.qyl.service.interfaces.IUserService;
import com.qyl.vo.BaseResult;
import com.qyl.vo.BizCode;
import com.qyl.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by qinyuanlong on 15/7/7.
 */
@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "register",method = RequestMethod.POST)
    @ResponseBody
    public BaseResult register(@Valid User user,BindingResult bindingResult) throws UserExistException{
        userService.register(user);
        return new BaseResult();
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public BaseResult login(@Valid User user,BindingResult bindingResult,HttpSession session){
        if(userService.login(user) > 0) {
            session.setAttribute("auth",user.getMail());
            return new BaseResult();
        }else{
            return new BaseResult(BizCode.NAME_OR_PASSWORD_ERROR,BizCode.NAME_OR_PASSWORD_ERROR_MESSAGE);
        }
    }
}
