package com.core.libraryManagementSystem.restController;

import com.core.libraryManagementSystem.dto.BookDto;
import com.core.libraryManagementSystem.service.BookService;
import com.core.libraryManagementSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminRestController {

    @Autowired
    private BookService bookService;

    @Autowired
    private StudentService studentService;

 //   @PostMapping("/book")


}
