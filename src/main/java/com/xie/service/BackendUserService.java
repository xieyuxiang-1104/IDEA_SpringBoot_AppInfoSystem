package com.xie.service;

import com.xie.pojo.BackendUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//后台
public interface BackendUserService {

    //用户登录
    List<BackendUser> Userlogin(@Param("userCode") String userCode, @Param("userPassword") String userPassword);

}
