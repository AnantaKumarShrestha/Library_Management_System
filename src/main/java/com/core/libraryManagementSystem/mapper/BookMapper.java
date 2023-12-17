package com.core.libraryManagementSystem.mapper;

import com.core.libraryManagementSystem.dto.BookDto;
import com.core.libraryManagementSystem.model.BookModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);
    BookDto bookModelIntoBookDto(BookModel book);
    BookModel bookDtoIntoBookModel(BookDto bookDto);

}
