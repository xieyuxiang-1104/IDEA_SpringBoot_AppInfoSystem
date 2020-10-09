package com.xie.controller;


import com.alibaba.fastjson.JSONArray;
import com.xie.pojo.DevUser;
import com.xie.service.BackendUserService;
import com.xie.service.DevUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

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
    @Autowired
    private DevUserService devUserService;


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
    @ResponseBody
    @RequestMapping(value = "/devuser_Login", method = RequestMethod.POST)
    public String devuser_Login(@Param("devCode")String devCode, @Param("devPassword") String devPassword) {
        List<DevUser> list =devUserService.DElogin(devCode, devPassword);
        System.out.println(devCode+"========"+devPassword);
        System.out.println(list);
        List<Object> l = new ArrayList<>();
        for (int a = 0; a < list.size(); a++) {
            l.add(list.get(a));
        }
        System.out.println(l);
        JSONArray json = new JSONArray(l);
        System.out.println(json.toJSONString());


        return json.toJSONString();
    }

    //后台
    @RequestMapping(value = "/backenduser_Login", method = RequestMethod.POST)
    public String backenduser_Login(@Param("userCode") String userCode,
                                    @Param("userPassword") String userPassword,
                                    HttpServletRequest request) {
        return "Ulogin.html";
    }

}












