package com.chen.docckerd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("hello")
    public String Hello() {
        return "hello nihao ";
    }
}