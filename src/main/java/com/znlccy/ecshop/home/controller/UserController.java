package com.znlccy.ecshop.home.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author Adminstrator
 * @Date 2018/1/19 22:29
 * @Version 1.0.0
 * @Comment 前台用户控制器
 */

@RestController
@RequestMapping(value = "/home/user")
public class UserController {

    /**
     * 实现用户登录功能
     */
    @GetMapping(value = "/login")
    @ResponseBody
    public ModelAndView userLogin() {
        return null;
    }

}
