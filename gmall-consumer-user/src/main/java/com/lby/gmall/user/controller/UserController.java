package com.lby.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lby.gmall.bean.UserInfo;
import com.lby.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("userList")
    @ResponseBody
    public List<UserInfo> userList(){
        List<UserInfo> userInfos = userService.getUserList();

        return userInfos;
    }
}
