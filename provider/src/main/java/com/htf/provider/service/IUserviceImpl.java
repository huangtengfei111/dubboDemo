package com.htf.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import pojo.User;
import service.IUserService;

/**
 * @Description: 用户服务的实现类
 * @Author: huangtf
 * @CreateDate: 2021/1/10 1:22
 */
//属于Dubbo的@Service注解，非Spring  作用：暴露服务
@Service
@Component
public class IUserviceImpl implements IUserService {

    @Override
    public User selectById(Integer id) {

        User user = new User();
        user.setAge(id);
        user.setName("张三");
        System.out.println("接收到了客户端的ID" + id);
        return user;
    }
}
