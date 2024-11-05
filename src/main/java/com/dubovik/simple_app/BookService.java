package com.dubovik.simple_app;

import java.util.Set;

public interface BookService {
  Set<Book> findAllBook();

  Book findBookByID(long id);

  String getEnvVariable();
}
