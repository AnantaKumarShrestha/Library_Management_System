package com.core.libraryManagementSystem.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private List<AuthorModel> authors;

    private String photo;
    private String type;
    private int price;
    private int available;
    private int checkout;





}
