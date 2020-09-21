package com.springboot.web.controller;

import com.springboot.web.dto.UserRequestDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * class Description: 测试Controller
 *
 * @author Ju.Baoquan
 * Created at  2020/9/21
 */
@Controller
@RequestMapping(value = "helloService")
public class HelloController {

    @RequestMapping(value = "helloPostMethod")
    @ResponseBody
    public Map<String,Object> helloPostMethod(@RequestBody UserRequestDTO request){
        Map<String, Object> result = new HashMap<>();
        return result;
    }

}
