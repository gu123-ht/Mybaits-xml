package com.capgemini.service;

import com.capgemini.pojo.User;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.capgemini.dao.UserMapper;

import java.util.List;

@Service
public class UserService{

    @Resource
    private UserMapper userMapper;

    public List<User> findAll(){
        return userMapper.findByAll();
    }
}
