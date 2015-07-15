package com.qyl.controllers;

import com.qyl.exception.UserExistException;
import com.qyl.service.UserService;
import com.qyl.vo.BaseResult;
import com.qyl.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.validation.Valid;

/**
 * Created by qinyuanlong on 15/7/7.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "register",method = RequestMethod.POST)
    @ResponseBody
    public BaseResult register(@Valid User user,BindingResult bindingResult) throws UserExistException{
        userService.registter(user);
        BaseResult result = new BaseResult();
        return result;
    }
}
