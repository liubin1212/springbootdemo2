package com.offcn.test;

import com.offcn.JpaApplication;
import com.offcn.mapper.MUserMapper;
import com.offcn.pojo.MUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaApplication.class)
public class APPTest {
    @Autowired
    MUserMapper mUserMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    public void getAllUser(){
        List<MUser> allMUser = mUserMapper.findAllMUser();
        for (MUser mUser : allMUser) {
            System.out.println(mUser);
        }
    }

    @Test
    public void testRedisTemplate(){
        redisTemplate.opsForValue().set("hello","刘斌");
        String name = (String)redisTemplate.opsForValue().get("hello");

        MUser user = new MUser(4,"haha","123456","liubin");
        redisTemplate.opsForValue().set("user",user);
        MUser user1 = (MUser)redisTemplate.opsForValue().get("user");
        System.out.println("name: " + name + "---" + "user: " + user);
        
    }
}
