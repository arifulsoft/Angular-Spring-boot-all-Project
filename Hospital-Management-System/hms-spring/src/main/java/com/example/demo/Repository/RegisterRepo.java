package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Register;

@Repository

public interface RegisterRepo extends CrudRepository<Register, String>{
	public Register findByUsernameAndPassword(String username, String password);

}
