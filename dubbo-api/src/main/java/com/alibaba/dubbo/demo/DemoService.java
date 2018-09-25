package com.alibaba.dubbo.demo;

import java.util.List;

/**
 * @author zft
 * @date 2018/9/21.
 */
public interface DemoService {
    List<String> getPermissions(Long id);
}

