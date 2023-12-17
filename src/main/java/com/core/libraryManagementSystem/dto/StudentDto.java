package com.core.libraryManagementSystem.dto;

import com.core.libraryManagementSystem.model.Address;
import com.core.libraryManagementSystem.model.Book;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@Setter
@Getter
public class StudentDto {
    private UUID id;
    private String name;
    private String email;
    private String phone;
    private LocalDate accOpenDate;
    private Address address;
    private List<Book> books;
}
