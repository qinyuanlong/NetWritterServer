package com.qyl.service;

import com.qyl.controllers.Product;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * Created by qinyuanlong on 15/7/1.
 */


public interface ProductService {

    @Select("select * from products")
    public List<Product> findAll();

}
