package com.lby.gmall.manage;

import com.lby.gmall.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallProviderManageApplicationTests {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void contextLoads() {
        Jedis jedis = redisUtil.getJedis();
        String ping = jedis.ping();
        System.out.println(ping);
    }

}

