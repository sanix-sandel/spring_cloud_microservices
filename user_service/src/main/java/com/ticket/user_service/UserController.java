package com.ticket.user_service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    private final FileStorageService fileStorageService;

    @GetMapping("")
    public List<User> home(){
        return userService.getAll();
    }

    @PostMapping("")
    public String create(@RequestBody UserRequest userRequest){
        return userService.createUser(userRequest);
    }

    @PostMapping("upload")
    public String upload(@RequestParam("files")MultipartFile file){
        return fileStorageService.storeFile(file);
    }
}
