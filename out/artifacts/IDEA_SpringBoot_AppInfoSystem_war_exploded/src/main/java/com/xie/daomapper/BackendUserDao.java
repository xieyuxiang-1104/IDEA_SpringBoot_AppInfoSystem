package com.xie.daomapper;

import com.xie.pojo.BackendUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

//后台
@Mapper
public interface BackendUserDao {

    //用户编码（登录账号）   用户密码
    BackendUser Userlogin(@Param("userCode") String userCode, @Param("userPassword") String userPassword);

}
