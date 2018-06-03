package com.tchoko.springboot.springdata.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tchoko.springboot.springdata.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
