package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book)     //kitap kaydetme fonk
    ;

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
