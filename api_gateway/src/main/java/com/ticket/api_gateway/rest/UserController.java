package com.ticket.api_gateway.rest;

import com.ticket.api_gateway.dto.User;
import com.ticket.api_gateway.proxies.UserProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user-service")
@RequiredArgsConstructor
public class UserController {

    private final UserProxy userProxy;

    @GetMapping("/sers")
    public List<User> home(){
        return userProxy.home();
    }

}
