package com.lby.gmall.user.controller;

import com.lby.gmall.bean.UserAddress;
import com.lby.gmall.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAddressController {

    @Autowired
    private UserAddressService userAddressService;

    @GetMapping("getUserList")
    public List<UserAddress> getUserAddressList(){
        return userAddressService.getUserAddressList();
    }

    @GetMapping("get/user/address/list/by/{userId}")
    public List<UserAddress> getUserAddressList(@PathVariable("userId") String userId){
        return userAddressService.getUserAddressByUserId(userId);
    }
}
