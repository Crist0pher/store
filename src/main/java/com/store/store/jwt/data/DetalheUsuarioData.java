package com.store.store.jwt.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.store.store.user.entities.User;

public class DetalheUsuarioData implements UserDetails{

    @Autowired
    Optional<User> user;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        
        return new ArrayList<>();
    }

    @Override
    public String getPassword() {
        
        return null;
    }

    @Override
    public String getUsername() {
        
        return user.orElse(new User()).getName();
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }

}
