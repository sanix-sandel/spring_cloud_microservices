package com.ticket.user_service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @GetMapping("")
    public List<User> home(){
        return userService.getAll();
    }

    @PostMapping("")
    public String create(@RequestBody UserRequest userRequest){
        return userService.createUser(userRequest);
    }
}
