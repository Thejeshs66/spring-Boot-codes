package com.example.StudentsBook.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentsBook.model.Book;



@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}
