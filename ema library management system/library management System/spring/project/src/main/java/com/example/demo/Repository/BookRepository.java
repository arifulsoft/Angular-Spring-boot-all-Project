package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.BorrowedBook;
import com.example.demo.Mystery;

@Repository
public interface  BookRepository  extends CrudRepository<BorrowedBook, Integer>{

}
