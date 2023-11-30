package com.zzy.system.controller.advice;

import com.zzy.commons.exception.ParamExcetion;
import com.zzy.commons.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExcetionHandler {

    /**处理参数异常*/
    @ExceptionHandler(ParamExcetion.class)
    public ResultVO handle(ParamExcetion e){
      log.error(e.getMessage(),e);
      return ResultVO.failed(e.getMessage());
    }

    /**处理其他的异常，返回系统异常*/
    @ExceptionHandler(Exception.class)
    public ResultVO handler(Exception e){
        log.error(e.getMessage(),e);
        return ResultVO.failed();
    }
}
