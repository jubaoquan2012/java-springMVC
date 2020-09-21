package com.spring.javainterviewtest.controller;

import com.spring.javainterviewtest.dto.UserRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 访问路径：
 * http://localhost:8080/helloController/helloPostMethod
 * <p>
 * controller 注解使用：https://blog.csdn.net/weixin_43184769/article/details/83383341
 * springboot设置默认访问路径 https://blog.csdn.net/qq_37796017/article/details/88344654
 */
@Controller
@RequestMapping(value = "/helloController")
public class HelloController {

    /**
     * URL : http://localhost:8080/helloController/helloPostMethod
     *
     * @param request
     * @return
     */
    @RequestMapping(value = "helloPostMethod")
    @ResponseBody
    public Map<String, Object> helloPostMethod(@RequestBody UserRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", request.getName());
        map.put("age", request.getAge());
        return map;

    }
}
