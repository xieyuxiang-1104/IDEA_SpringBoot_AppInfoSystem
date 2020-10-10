package com.xie.controller;

import com.xie.pojo.DevUser;
import com.xie.service.BackendUserService;
import com.xie.service.DevUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    //@ResponseBody
    @RequestMapping(value = "/devuser_Login", method = RequestMethod.POST)
    public String devuser_Login(Model model, String devCode, String devPassword) {
        List list = devUserService.DElogin(devCode, devPassword);
        System.out.println(list);
//        model.addAttribute("name",list);
        if (list.size() != 0) {
            System.out.println("成功" + list);
            return "Dlogin";
        }
        System.out.println("失败");
        return "DElogin";
/*
               for (DevUser a:list) {
            System.out.println(22222);
            System.out.println(a);
        }
        System.out.println(devCode+"========"+devPassword);
        System.out.println(list);
        List<Object> l = new ArrayList<>();
        for (int a = 0; a < list.size(); a++) {
            l.add(list.get(a));
        }
        System.out.println(l);
        JSONArray json = new JSONArray(l);
        System.out.println(json.toJSONString());

        if(json.toJSONString()=="test001"){
            return "Dlogin.html";
        }
        return json.toJSONString();*/
    }


    //后台
    @RequestMapping(value = "/backenduser_Login", method = RequestMethod.POST)
    public String backenduser_Login(String userCode, String userPassword) {
        List list = backendUserService.Userlogin(userCode, userPassword);
        System.out.println(list);
        if (list.size() != 0) {
            return "Ulogin";
        }
        return "Userlogin";
    }

}












