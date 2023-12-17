package com.core.libraryManagementSystem.mapper;

import com.core.libraryManagementSystem.dto.AuthorDto;
import com.core.libraryManagementSystem.model.AuthorModel;
import org.mapstruct.Mapper;

@Mapper
public interface AuthorMapper {

    AuthorDto authorModelIntoAuthorDto(AuthorModel author);
    AuthorModel authorDtoIntoAuthorModel(AuthorDto authorDto);

}
