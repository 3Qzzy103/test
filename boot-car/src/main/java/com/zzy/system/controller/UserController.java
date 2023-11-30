package com.zzy.system.controller;

import com.zzy.commons.vo.ResultVO;
import com.zzy.system.entity.User;
import com.zzy.system.service.UserService;
import com.zzy.system.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser")
    public ResultVO<User> getUser(String username){
        User user = userService.getUser(username);
        return ResultVO.success(user);
    }

    /**
     * 登录接口
     */
    @PostMapping("/login")
    public ResultVO login(LoginVO loginVO){
        String token = userService.login(loginVO);
        return ResultVO.success(token);
    }
}
