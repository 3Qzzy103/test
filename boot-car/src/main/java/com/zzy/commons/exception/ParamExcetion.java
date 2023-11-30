package com.zzy.commons.exception;

/**
 * 自定义的参数异常
 */
public class ParamExcetion extends RuntimeException {

    public ParamExcetion(String msg) {
        super(msg);
    }
}
