package com.core.libraryManagementSystem.Exception;


import java.util.UUID;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(UUID id){
        super(String.format("Student not found student id: %s",id));
    }

}
