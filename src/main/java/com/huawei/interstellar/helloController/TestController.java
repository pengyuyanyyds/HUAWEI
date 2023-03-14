package com.huawei.interstellar.helloController;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: sugar
 * @Date: 2023/03/14/22:09
 * @Description:
 */

@RestController("/huawei")
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
