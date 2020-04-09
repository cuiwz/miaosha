package com.imooc.miaoshaproject.service;

import com.imooc.miaoshaproject.error.BusinessException;
import com.imooc.miaoshaproject.service.model.UserModel;

public interface UserService {
    /**
     * 通过用户ID获取用户对象的方法
     * @param id
     * @return
     */
    UserModel getUserById(Integer id);

    /**
     * 通过缓存获取用户对象
     * @param id
     * @return
     */
    UserModel getUserByIdInCache(Integer id);

    /**
     * 注册用户
     * @param userModel
     * @throws BusinessException
     */
    void register(UserModel userModel) throws BusinessException;

    /**
     * telphone:用户注册手机
     * password:用户加密后的密码
     * @param telphone
     * @param encrptPassword
     * @return
     * @throws BusinessException
     */
    UserModel validateLogin(String telphone,String encrptPassword) throws BusinessException;
}
