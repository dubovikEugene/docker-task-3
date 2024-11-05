package com.dubovik.simple_app;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

  @Autowired
  private Environment env;

  HashSet<Book> bookList = new HashSet<Book>(Set.of(
      new Book(1L, "LOTR", "cool title"),
      new Book(2L, "One more book", "cool title for new book ")
  ));

  @Override
  public Set<Book> findAllBook() {
    if (bookList.isEmpty()) {
      return null;
    } else {
      return Collections.unmodifiableSet(bookList);
    }
  }

  @Override
  public Book findBookByID(long id) {
    return bookList.stream().filter(b -> b.getId() == id).findAny().orElse(null);
  }

  @Override
  public String getEnvVariable() {
    return env.getProperty("custom.devops");
  }
}
