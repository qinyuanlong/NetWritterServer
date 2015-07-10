package com.qyl.mapper;

import com.qyl.vo.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by qinyuanlong on 15/7/1.
 */

@Repository("productMapper")
public interface ProductMapper {

    @Select("select * from products")
    public List<Product> findAll();

}
