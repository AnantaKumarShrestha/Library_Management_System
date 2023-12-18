package com.core.libraryManagementSystem.service;

import com.core.libraryManagementSystem.dto.BookDto;
import com.core.libraryManagementSystem.dto.StudentDto;

import java.util.List;
import java.util.UUID;

public interface BookService {


    BookDto addBook(BookDto bookDto);
    List<BookDto> getAllBooks();
    BookDto getBooksById(UUID id);
    List<BookDto> getBooksByType(String type);
    List<BookDto> getBooksInLibrary();
    List<BookDto> getBooksCheckOut();

    //==================================================================================
    StudentDto addStudent(StudentDto studentDto);
    List<StudentDto> getAllStudents();
    StudentDto getStudentById(UUID id);


}
