package com.ecommerce.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${spring.datasource.url}")
    private String dbUrl;

    @GetMapping("/test-config")
    public String testConfig() {
        return "DB URL: " + dbUrl;
    }
}
