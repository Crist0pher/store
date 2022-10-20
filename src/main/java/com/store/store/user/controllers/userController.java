package com.store.store.user.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.store.store.generic.controller.GenericController;
import com.store.store.user.entities.User;
import com.store.store.user.repository.UserRepository;
import com.store.store.user.service.UserService;

@RestController
@RequestMapping("/user")
public class userController extends GenericController<User, Long,UserRepository , UserService> {

    @Autowired
    UserService service;

    private final PasswordEncoder encoder;

    public userController(PasswordEncoder encoder) {
        this.encoder = encoder;
    }

    @GetMapping("/save")
    public User save(@RequestBody User user) {
        user.setPassword(encoder.encode(user.getPassword()));

        return service.save(user);

    }

    @PostMapping("/valid")
    public User valid(@RequestParam String login, @RequestParam String password){
      
        return null;
        
    }
    @GetMapping("/login")
    public User getByLogin(@RequestParam String login) {
        return service.findByLogin(login);
        
    }

}
