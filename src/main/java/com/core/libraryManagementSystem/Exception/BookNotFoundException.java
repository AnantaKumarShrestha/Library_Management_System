package com.core.libraryManagementSystem.Exception;

import java.util.UUID;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(UUID id){
        super(String.format("Book not found BookId : %s",id));
    }
}
