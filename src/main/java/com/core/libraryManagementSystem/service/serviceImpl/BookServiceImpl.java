package com.core.libraryManagementSystem.service.serviceImpl;

import com.core.libraryManagementSystem.Exception.BookNotFoundException;
import com.core.libraryManagementSystem.dto.BookDto;
import com.core.libraryManagementSystem.dto.StudentDto;
import com.core.libraryManagementSystem.mapper.BookMapper;
import com.core.libraryManagementSystem.mapper.StudentMapper;
import com.core.libraryManagementSystem.model.BookModel;
import com.core.libraryManagementSystem.repo.BookRepo;
import com.core.libraryManagementSystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookRepo bookRepo;


    @Override
    public BookDto addBook(BookDto bookDto) {
        BookModel book=BookMapper.INSTANCE.bookDtoIntoBookModel(bookDto);
        return BookMapper.INSTANCE.bookModelIntoBookDto(bookRepo.save(book));
    }

    @Override
    public List<BookDto> getAllBooks() {
        List<BookModel> bookList=bookRepo.findAll();
        return BookMapper.INSTANCE.bookModeIntoBookDtoList(bookList);

    }

    @Override
    public BookDto getBooksById(UUID id) {
        BookModel book=bookRepo.findById(id).orElseThrow(()->new BookNotFoundException(id));
        return BookMapper.INSTANCE.bookModelIntoBookDto(book);
    }

    @Override
    public List<BookDto> getBooksByType(String type) {
        return null;
    }

    @Override
    public List<BookDto> getBooksInLibrary() {
        List<BookModel> bookList=bookRepo.getBooksAvailableInLibrary();
        return BookMapper.INSTANCE.bookModeIntoBookDtoList(bookList);
    }

    @Override
    public List<BookDto> getBooksCheckOut() {
        List<BookModel> bookList=bookRepo.getCheckoutBooks();
        return BookMapper.INSTANCE.bookModeIntoBookDtoList(bookList);
    }

    @Override
    public StudentDto addStudent(StudentDto studentDto) {
        return null;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        return null;
    }

    @Override
    public StudentDto getStudentById(UUID id) {
        return null;
    }


}
