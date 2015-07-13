package com.qyl.controllers;

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

    /**
     * 添加用户   TODO:参数验证
     * @param user
     * @return
     */
    @RequestMapping(value = "addUser",method = RequestMethod.POST)
    @ResponseBody
    public BaseResult addUser(@Valid User user,BindingResult bindingResult){
        userService.addUser(user);
        BaseResult result = new BaseResult();
        return result;
    }
}
