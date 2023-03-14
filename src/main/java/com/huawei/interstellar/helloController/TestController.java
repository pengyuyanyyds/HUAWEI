package com.huawei.interstellar.helloController;

import com.huawei.interstellar.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: sugar
 * @Date: 2023/03/14/22:09
 * @Description:
 */

@RestController
@RequestMapping("/huawei")
public class TestController {
    @Autowired
    UserServiceImpl userService;
    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
