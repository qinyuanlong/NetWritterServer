package com.qyl.mapper;

import com.qyl.vo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by qinyuanlong on 15/7/9.
 */
@Repository("userMapper")
public interface UserMapper {

    @Insert("insert into users(id,mail,password,nick,create_at,update_at) values(#{id},#{mail},#{password},#{nick},#{createAt},#{updateAt})")
    void add(User user);

    @Select("select count(*) from users where mail = #{mail}")
    int find(String mail);
}
