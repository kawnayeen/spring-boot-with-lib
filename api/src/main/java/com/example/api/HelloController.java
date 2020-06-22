package com.example.api;

import hello.packages.GithubLib;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        var githubLib = new GithubLib();
        return githubLib.sayHello();
    }
}
