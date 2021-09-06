package com.ticket.user_service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public String createUser(UserRequest userRequest) {
        User user=new User();
        user.setUsername(userRequest.getUsername());
        userRepository.save(user);
        return "User successfully created";
    }
}
