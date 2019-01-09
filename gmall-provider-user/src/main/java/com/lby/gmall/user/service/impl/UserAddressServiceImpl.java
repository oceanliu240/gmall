package com.lby.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lby.gmall.bean.UserAddress;
import com.lby.gmall.service.UserAddressService;
import com.lby.gmall.user.mapper.UserAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

@Service
public class UserAddressServiceImpl implements UserAddressService {

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserAddress> getUserAddressList() {
        return userAddressMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressByUserId(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        return userAddressMapper.select(userAddress);
    }
}
