package com.core.libraryManagementSystem.mapper;

import com.core.libraryManagementSystem.dto.StudentDto;
import com.core.libraryManagementSystem.model.StudentModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {

  StudentMapper INSTANCE= Mappers.getMapper(StudentMapper.class);

  StudentDto studentModelIntoStudentDto(StudentModel student);
  StudentModel studentDtoIntoStudentModel(StudentDto studentDto);


}
