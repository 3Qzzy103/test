package com.zzy.system.service.impl;

import cn.hutool.crypto.digest.MD5;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzy.commons.exception.ParamExcetion;
import com.zzy.commons.utils.JwtUtil;
import com.zzy.system.entity.User;
import com.zzy.system.mapper.UserMapper;
import com.zzy.system.service.UserService;
import com.zzy.system.vo.LoginVO;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/***
 * 用户服务
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Override
    public User getUser(String username) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        return getOne(queryWrapper);
    }

    @Override
    public String login(LoginVO loginVO) {

        //验证用户名
        User user = getUser(loginVO.getUsername());
        if(ObjectUtils.isEmpty(user)){
            throw new ParamExcetion("用户名或密码错误！");
        }
        //验证密码
        String password = MD5.create().digestHex(loginVO.getPassword());
        if(!StringUtils.equals(password,user.getPassword())){
            throw new ParamExcetion("用户名或者密码错误！");
        }

        //返回toten
        return JwtUtil.createJwt(loginVO.getUsername());
    }
}
