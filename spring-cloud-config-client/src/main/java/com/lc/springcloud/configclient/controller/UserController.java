package com.lc.springcloud.configclient.controller;

import java.util.Objects;

import com.lc.springcloud.configclient.entity.UserEntity;
import com.lc.springcloud.configclient.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LC
 * @date 2018/11/20
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/get/{id}")
    @ResponseBody
    public String getUserNameById(@PathVariable String id) throws Exception {
        UserEntity userEntity =userMapper.selectById(id);
        if(Objects.isNull(userEntity)){
            throw new Exception("用户不存在");
        }
        return userEntity.getName();
    }

}
 