package com.offcn.mapper;

import com.offcn.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper   // 该注解可以 自动生成mybatis映射配置文件
public interface UserMapper {


    // 自动生成sql语句
    @Insert("insert into user(name,age) values(#{name},#{age})")
    public void add(User user);

    @Update("update user set name=#{name},age=#{age} where id=#{id}")
    public void update(User user,Long id);


    @Delete("delete from user where id=#{id}")
    public void delete(Long id);


    @Select("select * from user")
    public List<User> findAll();

    @Select("SELECT * FROM user WHERE id=#{id}")
    public User findOne(Long id);
}


