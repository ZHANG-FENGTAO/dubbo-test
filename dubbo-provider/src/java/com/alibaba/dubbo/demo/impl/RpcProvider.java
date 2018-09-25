package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.RpcFramework;
import com.alibaba.dubbo.demo.UserService;

/**
 * @author william.liangf  http://javatar.iteye.com/blog/1123915#bc2402961
 *
 */
public class RpcProvider {

    public static void main(String[] args) throws Exception {
        UserService service = new UserServiceImpl();
        RpcFramework.export(service, 1234);
    }

}
