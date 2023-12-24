package com.core.libraryManagementSystem.restController;

import com.core.libraryManagementSystem.dto.BookDto;
import com.core.libraryManagementSystem.service.BookService;
import com.core.libraryManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/admin")
public class AdminRestController {

    @Autowired
    private BookService bookService;

    @Autowired
    private StudentService studentService;

//    @PostMapping("/book")
//    public ResponseEntity<BookDto> addBook(@RequestBody BookDto bookDto){
//        return new ResponseEntity<>(bookService.addBook(bookDto), HttpStatus.CREATED);
//    }

    @PostMapping("/book")
    public BookDto addBook(@RequestBody BookDto bookDto){
        return bookService.addBook(bookDto);
    }

    @GetMapping("/books")
    public List<BookDto> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{booksId}")
    public BookDto getBooksById(UUID id){
        return bookService.getBooksById(id);
    }

    @GetMapping("/books/available")
    public List<BookDto> getAvailableBooks(){
        return bookService.getBooksInLibrary();
    }

    @GetMapping("/books/checkout")
    public List<BookDto> getCheckoutBooks(){
        return bookService.getBooksCheckOut();
    }


}
