package com.pinyougou.springboot_mybatis.controller;

import com.pinyougou.springboot_mybatis.domain.User;
import com.pinyougou.springboot_mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybatisController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/query")
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }
}
