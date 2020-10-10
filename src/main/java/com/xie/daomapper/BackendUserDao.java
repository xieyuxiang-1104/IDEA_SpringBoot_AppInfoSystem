package com.xie.daomapper;

import com.xie.pojo.BackendUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//后台
@Mapper
public interface BackendUserDao {

    //用户编码（登录账号）   用户密码
    List<BackendUser> Userlogin(@Param("userCode") String userCode, @Param("userPassword") String userPassword);

}
