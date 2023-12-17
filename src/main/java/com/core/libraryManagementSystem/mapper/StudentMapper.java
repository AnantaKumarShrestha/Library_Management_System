package com.core.libraryManagementSystem.mapper;

import com.core.libraryManagementSystem.dto.StudentDto;
import com.core.libraryManagementSystem.model.Student;
import org.mapstruct.Mapper;

@Mapper
public interface StudentMapper {

  StudentDto studentModelIntoStudentDto(Student student);
  Student studentDtoIntoStudentModel(StudentDto studentDto);


}
