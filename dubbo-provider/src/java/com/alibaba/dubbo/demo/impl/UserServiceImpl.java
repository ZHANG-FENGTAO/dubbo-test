package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.UserService;

/**
 * @author zft
 * @date 2018/9/25.
 */
public class UserServiceImpl implements UserService {
    @Override
    public String getUserNameById(Integer id) {
        return "和哈哈哈哈";
    }
}
