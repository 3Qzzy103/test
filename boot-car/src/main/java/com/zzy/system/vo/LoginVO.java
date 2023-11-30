package com.zzy.system.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 登录接口参数
 */
@Data
public class  LoginVO {

    @NotBlank(message = "必填")
    private String username;

    @NotBlank(message = "必填")
    private String password;

}
