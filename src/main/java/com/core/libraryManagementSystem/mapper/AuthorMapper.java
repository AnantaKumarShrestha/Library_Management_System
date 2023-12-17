package com.core.libraryManagementSystem.mapper;

import com.core.libraryManagementSystem.dto.AuthorDto;
import com.core.libraryManagementSystem.model.AuthorModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE= Mappers.getMapper(AuthorMapper.class);
    AuthorDto authorModelIntoAuthorDto(AuthorModel author);
    AuthorModel authorDtoIntoAuthorModel(AuthorDto authorDto);

}
