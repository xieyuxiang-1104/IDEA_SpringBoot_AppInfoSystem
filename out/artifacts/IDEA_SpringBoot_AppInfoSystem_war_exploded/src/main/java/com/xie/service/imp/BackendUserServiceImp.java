package com.xie.service.imp;

import com.xie.daomapper.BackendUserDao;
import com.xie.pojo.BackendUser;
import com.xie.service.BackendUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//后台
@Service
public class BackendUserServiceImp implements BackendUserService {
    /**
     * 注入dao
     */
    @Autowired
    private BackendUserDao backendUserDao;

    //登录
    @Override
    public BackendUser Userlogin(@Param("userCode") String userCode, @Param("userPassword") String userPassword) {
        return backendUserDao.Userlogin(userCode, userPassword);
    }
}
