package com.xie.service;

import com.xie.pojo.BackendUser;
import com.xie.pojo.DevUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//开发
public interface DevUserService {

    // 开发者帐号(系统登录账号)  开发者密码
    List<DevUser> DElogin(@Param("devCode") String devCode, @Param("devPassword") String devPassword);

}
