package com.dubovik.simple_app;

import java.util.HashSet;

public interface BookService {
    HashSet<Book> findAllBook();
    Book findBookByID(long id);
    String getEnvVariable();
}
