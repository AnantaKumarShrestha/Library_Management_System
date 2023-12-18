package com.core.libraryManagementSystem.mapper;

import com.core.libraryManagementSystem.dto.StudentDto;
import com.core.libraryManagementSystem.model.StudentModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StudentMapper {

  StudentMapper INSTANCE= Mappers.getMapper(StudentMapper.class);

  StudentDto studentModelIntoStudentDto(StudentModel student);
  StudentModel studentDtoIntoStudentModel(StudentDto studentDto);

  List<StudentDto> studentModelIntoStudentDtoList(List<StudentModel> studentModelList);

}
