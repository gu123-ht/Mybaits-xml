package com.capgemini.controller;

import com.capgemini.pojo.User;
import com.capgemini.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;


@RestController
@RequestMapping("/User")
@Api("xml项目测试Swagger")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有User
     */
    @GetMapping
    @ApiOperation("xml方式查询所有测试")
    public void findAll() {
        List<User> all = userService.findAll();
        for (User user : all) {
            System.out.println(user);
        }
        Logger.getLogger("测试").info("测试日志");
    }
}
