package com.lby.gmall.service;

import com.lby.gmall.bean.UserAddress;

import java.util.List;

public interface UserAddressService {

    List<UserAddress> getUserAddressList();

    List<UserAddress> getUserAddressByUserId(String userId);
}
