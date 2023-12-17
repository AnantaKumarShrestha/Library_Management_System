package com.core.libraryManagementSystem.mapper;

import com.core.libraryManagementSystem.dto.StudentDto;
import com.core.libraryManagementSystem.model.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {

  StudentMapper INSTANCE= Mappers.getMapper(StudentMapper.class);

  StudentDto studentModelIntoStudentDto(Student student);
  Student studentDtoIntoStudentModel(StudentDto studentDto);


}
