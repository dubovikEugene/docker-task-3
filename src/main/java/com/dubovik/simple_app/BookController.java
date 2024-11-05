package com.dubovik.simple_app;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings({"checkstyle:Indentation", "checkstyle:LeftCurly"})
@RestController
public class BookController {

  @Autowired
  BookServiceImpl bookServiceImpl;

  @GetMapping("/findall")
  public Set<Book> getAllBook() {
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