package com.practice.practice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("loveyy")
    public String hello() {

        return "helloworld";
    }

}