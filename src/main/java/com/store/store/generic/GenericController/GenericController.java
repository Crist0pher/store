package com.store.store.generic.GenericController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.store.store.generic.GenericRepository.GenericRepository;
import com.store.store.generic.GenericService.GenericService;

@RestController
public class GenericController<T, ID, R extends GenericRepository<T ,ID>,S extends GenericService<T, ID , R>> {

	@Autowired
	S service;

	@GetMapping("/id")
	public Optional<T> getById(@RequestParam ID id) {

		return service.findById(id);

	}

	@GetMapping("/all")
	public List<T> listAll() {

		return service.listAll();
	}

	@PostMapping("/save")
	public Object save(@RequestBody T entity){

		return service.save(entity);
	}

}
