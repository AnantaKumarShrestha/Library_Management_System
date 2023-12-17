package com.core.libraryManagementSystem.mapper;

import com.core.libraryManagementSystem.dto.BookDto;
import com.core.libraryManagementSystem.model.BookModel;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper {
    BookDto bookModelIntoBookDto(BookModel book);
    BookModel bookDtoIntoBookModel(BookDto bookDto);

}
