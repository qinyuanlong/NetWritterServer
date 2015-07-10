package com.qyl.controllers;

import com.qyl.service.UserService;
import com.qyl.vo.BaseResult;
import com.qyl.vo.ParamsError;
import com.qyl.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

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
    @RequestMapping("addUser")
    @ResponseBody
    public BaseResult addUser(@Valid User user,BindingResult bindingResult){
        List<FieldError> errors = bindingResult.getFieldErrors();
        BaseResult result;
        if(bindingResult.hasErrors()){
            result = new ParamsError();
            for (FieldError error : errors ) {
                System.out.println(error.getField() + " - " + error.getDefaultMessage());
                result.setData(new HashMap<String, String>());
                HashMap<String,String> hash = (HashMap<String,String>)result.getData();
                hash.put(error.getField(), error.getDefaultMessage());
            }
            return result;
        }
        else{
            userService.addUser(user);
            result = new BaseResult();
            return result;
        }
    }

}
