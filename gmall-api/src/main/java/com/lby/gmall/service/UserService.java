package com.lby.gmall.service;

import com.lby.gmall.bean.UserAddress;
import com.lby.gmall.bean.UserInfo;

import java.util.List;

public interface UserService {


    List<UserAddress> getAddressList();

    List<UserAddress> getAddressListByUserId(String userId);

    UserAddress getAddressById(String addressId);

    List<UserInfo> getUserList();

    UserInfo login(UserInfo userInfo);

    void addUserCache(UserInfo userLogin);
}
