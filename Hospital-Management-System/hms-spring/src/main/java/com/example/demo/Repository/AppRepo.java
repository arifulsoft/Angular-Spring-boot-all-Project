package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.App_status;

@Repository
public interface AppRepo extends CrudRepository<App_status, String> {

}
