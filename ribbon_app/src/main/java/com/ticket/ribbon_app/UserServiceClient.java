package com.ticket.ribbon_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class UserServiceClient {

    @Autowired
    HelloServiceClient helloServiceClient;

    @GetMapping("say-users")
    List<User> getUsers(){
        return helloServiceClient.home();
    }
}
