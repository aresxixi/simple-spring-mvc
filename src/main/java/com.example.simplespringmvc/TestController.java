package com.example.simplespringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@Controller
public class TestController {

    @RequestMapping("test")
    public String test(){
        return "index";
    }

}
