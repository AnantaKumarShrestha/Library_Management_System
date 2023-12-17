package com.core.libraryManagementSystem.mapper;

import com.core.libraryManagementSystem.dto.StudentDto;
import com.core.libraryManagementSystem.model.StudentModel;
import org.mapstruct.Mapper;

@Mapper
public interface StudentMapper {

  StudentDto studentModelIntoStudentDto(StudentModel student);
  StudentModel studentDtoIntoStudentModel(StudentDto studentDto);


}
