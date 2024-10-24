package com.curso.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/welcome")
public class MainController {

    @ResponseBody
    @GetMapping("/")
    public String hello() {
        return "Hello Controller";
    }

}
