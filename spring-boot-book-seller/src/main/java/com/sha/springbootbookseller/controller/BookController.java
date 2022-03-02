package com.sha.springbootbookseller.controller;

import com.sha.springbootbookseller.model.Book;
import com.sha.springbootbookseller.repository.IBookRepository;
import com.sha.springbootbookseller.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/book")
public class BookController
{
    @Autowired
    private IBookService bookService;

    @PostMapping
    public ResponseEntity<?> saveBook(@RequestBody Book book)   //1. yontem kitap kaydetme
    {
        return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.CREATED);
    }

    @DeleteMapping("{bookId}")
    public ResponseEntity<?> deleteBook(@PathVariable Long bookId)  //2. yontem id ile kitap silme
    {
        bookService.deleteBook(bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllBooks()  //3. yontem kitap getir
    {
        return new ResponseEntity<>(bookService.findAllBooks(), HttpStatus.OK);
    }
}
