package com.zzy.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzy.system.entity.User;
import com.zzy.system.vo.LoginVO;

public interface UserService extends IService<User> {

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User getUser(String username);

    /**
     * 登录
     */
    String login(LoginVO loginVO);
}
