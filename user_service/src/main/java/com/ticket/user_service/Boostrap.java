package com.ticket.user_service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class Boostrap implements ApplicationListener<ContextRefreshedEvent> {
    private final UserRepository userRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        userRepository.saveAll(getUsers());
    }

    private List<User> getUsers(){

        List<User>users=new ArrayList<>();

        User user1=new User();
        user1.setUsername("sanick");
        users.add(user1);

        User user2=new User();
        user2.setUsername("sandel");
        users.add(user2);

        User user3=new User();
        user3.setUsername("judial");
        users.add(user3);

        User user4=new User();
        user4.setUsername("ikani");
        users.add(user4);

        return users;

    }
}
