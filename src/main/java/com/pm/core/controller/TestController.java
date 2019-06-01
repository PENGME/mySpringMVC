package com.pm.core.controller;

import com.pm.annotation.MyController;
import com.pm.annotation.MyRequestMapping;
import com.pm.annotation.MyRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@MyController
@MyRequestMapping("/test")
public class TestController {
    @MyRequestMapping("/doTest")
    public void test1(HttpServletRequest request, HttpServletResponse response,
    @MyRequestParam("param") String param){
        System.out.println(param);
        try {
            response.getWriter().write("doTest success! param:"+param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
