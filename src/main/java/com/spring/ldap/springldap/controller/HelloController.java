package com.spring.ldap.springldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/login")
public class HelloController {

    @GetMapping("/check")
    public String check() {
        return "User valid.";
    }
}