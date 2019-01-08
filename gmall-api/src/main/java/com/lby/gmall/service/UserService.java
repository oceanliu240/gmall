package com.lby.gmall.service;

import com.lby.gmall.bean.UserAddress;
import com.lby.gmall.bean.UserInfo;

import java.util.List;

public interface UserService {


    List<UserAddress> getAddressList();

    List<UserAddress> getAddressListByUserId(String userId);

    UserAddress getAddressListById(String addressId);

    List<UserInfo> getUserList();
}
