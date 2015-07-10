package com.qyl.service;

import com.qyl.mapper.ProductMapper;
import com.qyl.vo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by qinyuanlong on 15/7/9.
 */
@Service
public class ProductService {

    @Autowired
    ProductMapper pm;

    public List<Product> findAll(){
        return pm.findAll();
    }
}
