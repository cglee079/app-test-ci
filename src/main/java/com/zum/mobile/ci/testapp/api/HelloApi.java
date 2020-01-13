package com.zum.mobile.ci.testapp.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    @RequestMapping("/")
    public String hellWorld() {
        return "Hello World? I am ci-test-app";
    }
}
