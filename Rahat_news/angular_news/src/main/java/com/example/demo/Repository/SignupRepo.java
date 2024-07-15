package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Signup;

@Repository
public interface SignupRepo extends CrudRepository<Signup, Integer> {

	Signup findByIdAndPassword(int id, String password);

//	Signup searchbyname(String name);
	

	

	
	
}
