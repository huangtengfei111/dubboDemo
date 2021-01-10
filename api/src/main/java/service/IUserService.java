package service;


import pojo.User;

/**
 * @Description: 用户服务
 * @Author: huangtf
 * @CreateDate: 2021/1/10 1:18
 */
public interface IUserService {

    User selectById(Integer id);
}
