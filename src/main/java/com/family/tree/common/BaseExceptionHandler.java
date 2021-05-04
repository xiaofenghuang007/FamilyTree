package com.family.tree.common;

//全局异常处理

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Result exception(Exception e) {
        System.out.println("异常信息：" + e.getMessage());

        return Result.getFail().setMag(e.getMessage());
    }

}
