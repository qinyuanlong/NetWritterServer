package com.qyl.mapper;

import com.qyl.vo.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * Created by qinyuanlong on 15/7/9.
 */
@Repository("userMapper")
public interface UserMapper {

    @Insert("insert into users(id,user_name,password,nick,create_at,update_at) values(#{id},#{userName},#{password},#{nick},#{createAt},#{updateAt})")
    public void add(User user);

}
