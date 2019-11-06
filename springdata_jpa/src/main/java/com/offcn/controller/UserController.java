package com.offcn.controller;

import com.offcn.entity.User;
import com.offcn.mapper.MUserMapper;
import com.offcn.mapper.UserMapper;
import com.offcn.pojo.MUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
//@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserMapper userMapper;

    @Resource
    MUserMapper mUserMapper;

    @GetMapping("/findAllUser")
    public List<User> findAllUser(){
        return userMapper.findAll();
    }

    @GetMapping("/findUser")
    public String findAllUser1(Model model){
        List<User> userList = userMapper.findAll();
        model.addAttribute("userlist",userList);
        return "user";
    }

    @GetMapping("/findAllMUser")
    public void findAllMUser(){
        List<MUser> mUserList = mUserMapper.findAllMUser();
        for (MUser mUser : mUserList) {
            System.out.println(mUser);
        }
    }

}
