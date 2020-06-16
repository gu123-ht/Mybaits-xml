package com.capgemini.dao;
import org.apache.ibatis.annotations.Param;

import com.capgemini.pojo.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<User>{
    List<User> findByAll();
}