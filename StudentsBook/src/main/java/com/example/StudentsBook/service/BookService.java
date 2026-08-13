package com.example.StudentsBook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentsBook.Repository.BookRepository;
import com.example.StudentsBook.model.Book;



@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks(){
		List<Book> books = new ArrayList<>();
		bookRepository.findAll().forEach(books1-> books.add(books1));
		return books;
	}

	public Book getBooksById(int id) {
		return bookRepository.findById(id).get();
	}
	
	public void saveOrUpdate(Book book) {
		bookRepository.save(book);
	}
	
	public void delete(int id) {
		bookRepository.deleteById(id);
	}
	
	public void deleteAllBooks() {
	    bookRepository.deleteAll();
	}
	
	public void update(Book book, int bookId) {
		bookRepository.save(book);
	}
	
	
}