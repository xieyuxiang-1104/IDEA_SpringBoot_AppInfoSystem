package com.xie.service.imp;

import com.xie.daomapper.DevUserDao;
import com.xie.pojo.DevUser;
import com.xie.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//后台
@Service
public class DevUserServiceImp implements DevUserService {
    /**
     * 注入dao
     */
    @Autowired
    private DevUserDao devUserDao;


    //登录
    @Override
    public List<DevUser> DElogin(String devCode, String devPassword) {
        return devUserDao.DElogin(devCode, devPassword);
    }
}
