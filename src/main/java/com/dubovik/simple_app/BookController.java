package com.dubovik.simple_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
public class BookController {

    @Autowired
    BookServiceImpl bookServiceImpl;

    @GetMapping("/findall")
    public HashSet<Book> getAllBook() {
        return bookServiceImpl.findAllBook();
    }

    @GetMapping("/env-variable")
    public String getEnvVariable() {
        return bookServiceImpl.getEnvVariable();
    }

    @GetMapping("/findbyid/{id}")
    public Book geBookById(@PathVariable long id) {
        return bookServiceImpl.findBookByID(id);
    }

}