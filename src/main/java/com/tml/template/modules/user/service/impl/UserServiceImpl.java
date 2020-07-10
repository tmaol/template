package com.tml.template.modules.user.service.impl;

import com.tml.template.modules.user.dao.UserMapper;
import com.tml.template.modules.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String hello() {
        return userMapper.hello();
    }
    
}