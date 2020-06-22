package com.example.api;

import lib.LocalLib;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        var localLib = new LocalLib();
        return localLib.sayHello();
    }
}
