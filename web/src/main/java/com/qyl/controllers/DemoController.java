package com.qyl.controllers;

import com.qyl.service.ProductService;
import com.qyl.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by qinyuanlong on 15/7/6.
 */
@Controller
public class DemoController {

    @Autowired
    private ProductService ps;

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "my project work !";
    }


    @RequestMapping("list")
    @ResponseBody
    public List<Product> list(){
        return ps.findAll();
    }
}
