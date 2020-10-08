package com.xie.controller;


import com.xie.service.BackendUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

//@RestController
@Controller
// 映射访问路径
@RequestMapping(value = "/login")
public class UserController {


    /**
     * 注入service
     */
    @Autowired
    private BackendUserService backendUserService;


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        System.out.println("跳转主页面");
        return "index";
    }

    //后台
    @RequestMapping(value = "/Userlogin")
    public String Userlogin() {
        System.out.println("跳转后台");
        return "Userlogin";
    }


    //开发
    @RequestMapping(value = "/DElogin", method = RequestMethod.GET)
    public String DElogin() {
        System.out.println("跳转开发");
        return "DElogin";
    }
    //====================================上面是跳转====================================

    //开发
    @RequestMapping(value = "/devuser_Login", method = RequestMethod.POST)
    public String devuser_Login(@Param("userCode") String userCode,
                                @Param("userPassword") String userPassword,
                                HttpServletRequest request) {
        System.out.println(userCode);
        System.out.println(userPassword);
        return "Dlogin.html";
    }

    //后台
    @RequestMapping(value = "/backenduser_Login", method = RequestMethod.POST)
    public String backenduser_Login(@Param("userCode") String userCode,
                                    @Param("userPassword") String userPassword,
                                    HttpServletRequest request) {
        return "Ulogin.html";
    }

}












