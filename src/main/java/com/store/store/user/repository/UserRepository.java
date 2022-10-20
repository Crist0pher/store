package com.store.store.user.repository;

import com.store.store.generic.GenericRepository.GenericRepository;
import com.store.store.user.entities.User;

public interface UserRepository extends GenericRepository<User, Long>{

    Object getByLogin(String login);

 //   Optional<User> getByLogin(String login);
    
}
