package com.htf.consumer.serviceImpl;


import com.alibaba.dubbo.config.annotation.Reference;
import com.htf.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;
import pojo.User;
import service.IUserService;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2021/1/10 1:25
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    /**
     * 使用dubbo的注解 com.alibaba.dubbo.config.annotation.Reference。进行远程调用service
     */
    @Reference
    IUserService userService;

    public User test(Integer age){
        return userService.selectById(age);
    }

}
