package com.javapath.springsecurityjpamysql.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloResource {

    @GetMapping
    public String helloAll(){
        return "<h1> Hello All</h1>";
    }

    @GetMapping("/user")
    public String helloUser(){
        return "<h1> Hello User</h1>";
    }

    @GetMapping("/superuser")
    public String helloSuperUser(){
        return "<h1> Hello Super User</h1>";
    }
    @GetMapping("/admin")
    public String helloAdmin(){
        return "<h1> Hello Admin</h1>";
    }
}
