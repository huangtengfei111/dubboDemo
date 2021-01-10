package com.htf.consumer.controller;

import com.htf.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.User;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2021/1/10 1:48
 */

@RestController
public class DemoController {

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/api")
    public User test(){
        return consumerService.test(10);
    }
}
