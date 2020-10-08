package com.xie.daomapper;

import com.xie.pojo.DevUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//开发者
@Mapper
public interface DevUserDao {

    // 开发者帐号(系统登录账号)  开发者密码
    DevUser DElogin(@Param("devCode") String devCode, @Param("devPassword") String devPassword);

}
