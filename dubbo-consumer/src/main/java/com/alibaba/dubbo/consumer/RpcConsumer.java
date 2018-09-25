package com.alibaba.dubbo.consumer;

import com.alibaba.dubbo.demo.UserService;
import com.alibaba.dubbo.demo.RpcFramework;

/**
 * @author william.liangf  http://javatar.iteye.com/blog/1123915#bc2402961
 *
 */
public class RpcConsumer {

    public static void main(String[] args) throws Exception {
        UserService service = RpcFramework.refer(UserService.class, "127.0.0.1", 1234);
        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            String hello = service.getUserNameById(1);
            System.out.println(hello);
            Thread.sleep(1000);
        }
    }

}
