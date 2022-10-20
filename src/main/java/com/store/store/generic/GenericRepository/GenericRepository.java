package com.store.store.generic.GenericRepository;

import java.util.List;
import java.util.Optional;

public interface GenericRepository <T,ID>{

    Optional<T> findById(ID id);

    T save(T entity);

    List<T> findAll();

    
}
