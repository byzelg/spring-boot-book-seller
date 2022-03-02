package com.sha.springbootbookseller.service;


import com.sha.springbootbookseller.model.Book;
import com.sha.springbootbookseller.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookService implements IBookService
{
    @Autowired //springte setter, constructorda AUTOWİRED anatasyonu kullanilir
    private final IBookRepository bookRepository;

    public BookService(IBookRepository bookRepository)
    {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book saveBook(Book book)     //1. yontem kitap kaydetme
    {
        book.setCreateTime(LocalDateTime.now());
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) //2. yontem kitap silme (JPA Repository yöntemi=deleteById())
    {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> findAllBooks()    //3. yontem kitap bulma (JPA Repository yöntemi=findAll())
    {
        return bookRepository.findAll();
    }


}
