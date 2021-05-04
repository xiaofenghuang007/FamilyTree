package com.family.tree.controller;

import com.family.tree.common.Result;
import com.family.tree.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
@RequestMapping("/test")
@Slf4j
public class TestController {

    //测试hello方法   Get
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        String text = "返回接口";
        System.out.println(text);
        return text;
//        String text = "返回页面";
//        System.out.println(text);
//        return "test/hello";
//        return "ok";
    }

//    统一返回类
    @RequestMapping(value = "/result", method = RequestMethod.GET)
    public Result result(){
//        return Result.getSuccess();
        return Result.getSuccess().setMag("操作成功").setData("123456789");
    }

//    全局异常处理
    @RequestMapping(value = "/testException/{number}", method = RequestMethod.GET)
    public Result hello3(@PathVariable Integer number){
        float f = 0f;
        int a = 4;
        f = a/number;
        return Result.getSuccess().setData(f);
    }

//    log4j测试
@RequestMapping(value = "/testLog", method = RequestMethod.GET)
    public Result tesLog(){
        System.out.println("测试日志");

        log.info("info日志");
        log.warn("warn日志");
        log.debug("debug日志");
        log.error("error日志");

        return Result.getSuccess();
    }

}
