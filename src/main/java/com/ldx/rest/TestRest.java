package com.ldx.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestRest {

    @GetMapping
    public String test(){
        return "hello test project";
    }

}
