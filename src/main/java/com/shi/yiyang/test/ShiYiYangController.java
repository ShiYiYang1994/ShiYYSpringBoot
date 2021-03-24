package com.shi.yiyang.test;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ShiYiYangController {

    private final static String USER_NAME = "史毅洋";

    @RequestMapping(value = "/hello")
    public String helloTest(HttpServletRequest request) {
        if (!StringUtils.isEmpty(USER_NAME)) {
            return USER_NAME;
        }
        return "kongde";
    }
}
