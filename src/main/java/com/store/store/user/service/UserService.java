package com.store.store.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.store.generic.service.GenericService;
import com.store.store.user.entities.User;
import com.store.store.user.repository.UserRepository;

@Service
public class UserService extends GenericService<User, Long, UserRepository> {

    @Autowired
    
    UserRepository repository;
    
    public User findByLogin(String login) {
    
        //User user = repository.getByLogin(login).get();   
        
        return null;
        
    }
    
}
