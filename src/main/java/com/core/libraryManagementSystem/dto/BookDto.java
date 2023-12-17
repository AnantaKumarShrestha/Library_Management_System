package com.core.libraryManagementSystem.dto;

import com.core.libraryManagementSystem.model.Author;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class BookDto {

    private UUID id;
    private String name;
    private List<Author> authors;
    private String photo;
    private String type;
    private int price;
    private int available;
    private int checkout;
}
