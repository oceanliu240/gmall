package com.lby.gmall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.lby.gmall.bean.UserAddress;
import com.lby.gmall.bean.UserInfo;
import com.lby.gmall.service.UserService;
import com.lby.gmall.user.mapper.UserAddressMapper;
import com.lby.gmall.user.mapper.UserInfoMapper;
import com.lby.gmall.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Autowired
    UserAddressMapper userAddressMapper;

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public List<UserAddress> getAddressList() {
        return userAddressMapper.selectAll();
    }



    @Override
    public List<UserAddress> getAddressListByUserId(String userId) {

        UserAddress userAddress =  new UserAddress();
        userAddress.setUserId(userId);
        List<UserAddress> userAddresses = userAddressMapper.select(userAddress);

        return userAddresses;
    }

    @Override
    public UserAddress getAddressById(String addressId) {

        UserAddress userAddress = new UserAddress();
        userAddress.setId(addressId);
        UserAddress userAddress1 = userAddressMapper.selectOne(userAddress);

        return userAddress1;
    }

    @Override
    public List<UserInfo> getUserList() {

        //List<UserInfo> userInfos = userInfoMapper.selectUserList();

        List<UserInfo> userInfos = userInfoMapper.selectAll();
        return userInfos;
    }

    @Override
    public UserInfo login(UserInfo userInfo) {
        //先查缓存
        UserInfo user = new UserInfo();
        user.setLoginName(userInfo.getLoginName());
        user.setPasswd(userInfo.getPasswd());
        user = userInfoMapper.selectOne(user);
        return user;
    }

    @Override
    public void addUserCache(UserInfo userLogin) {
        Jedis jedis = redisUtil.getJedis();
        jedis.setex("userInfo:" + userLogin.getId() , 60 * 60 * 24, JSON.toJSONString(userLogin));
        jedis.close();
    }
}
