package com.core.libraryManagementSystem.mapper;

import com.core.libraryManagementSystem.dto.AuthorDto;
import com.core.libraryManagementSystem.model.Author;
import org.mapstruct.Mapper;

@Mapper
public interface AuthorMapper {

    AuthorDto authorModelIntoAuthorDto(Author author);
    Author authorDtoIntoAuthorModel(AuthorDto authorDto);

}
