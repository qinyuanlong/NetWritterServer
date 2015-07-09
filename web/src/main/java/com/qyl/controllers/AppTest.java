package com.qyl.controllers;

import com.qyl.service.ProductService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Created by qinyuanlong on 15/7/6.
 */
@Controller
public class AppTest {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "my project work !";
    }


    @RequestMapping("list")
    @ResponseBody
    public List<Product> list(){
        System.out.println("in list controller");
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("config/mybatis-config.xml");
        } catch (IOException e){
            e.printStackTrace();
        }
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(reader);
//        ssf.getConfiguration().addMapper(ProductService.class);
        SqlSession ss = ssf.openSession();
        List<Product> list = null;
        try{
            list = ss.getMapper(ProductService.class).findAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        ss.close();

        return list;
    }
}
