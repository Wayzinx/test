package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/test")
@ResponseBody
public class TestController {

    @GetMapping("/test")
    public String createOrder()  {
         return "hello world1";
    }
}
