package com.qyl.mapper;

import com.qyl.vo.Product;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * Created by qinyuanlong on 15/7/1.
 */


public interface ProductMapper {

    @Select("select * from products")
    public List<Product> findAll();

}
