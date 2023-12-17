package com.core.libraryManagementSystem.mapper;

import com.core.libraryManagementSystem.dto.BookDto;
import com.core.libraryManagementSystem.model.Book;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper {
    BookDto bookModelIntoBookDto(Book book);
    Book bookDtoIntoBookModel(BookDto bookDto);

}
