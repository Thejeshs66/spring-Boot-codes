package com.example.StudentsBook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentsBook.model.Book;
import com.example.StudentsBook.service.BookService;



@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{bookId}")
    public Book getBookById(@PathVariable int bookId) {
        return bookService.getBooksById(bookId);
    }

    @PostMapping("/bulk")
    public List<Book> saveBooks(@RequestBody List<Book> books) {
        books.forEach(bookService::saveOrUpdate);
        return books;
    }

    @PutMapping("/{bookId}")
    public Book updateBook(@RequestBody Book book, @PathVariable int bookId) {
        bookService.update(book, bookId);
        return book;
    }

    @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable int bookId) {
        bookService.delete(bookId);
    }
    
    @DeleteMapping
    public void deleteAllBooks() {
        bookService.deleteAllBooks();
    }

}
