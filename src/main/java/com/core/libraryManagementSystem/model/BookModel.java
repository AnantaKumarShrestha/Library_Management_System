package com.core.libraryManagementSystem.model;

import jakarta.persistence.*;
import lombok.Data;

import java.lang.annotation.Native;
import java.util.List;
import java.util.UUID;

@NamedNativeQuery(name = "availableBooks", query = "select b.id,b.name,b.available from BookModel b where b.available > 0 order by b.available asc")
@NamedQuery(name = "checkoutBooks",query = "select b.id,b.name,b.checkout from BookModel b where b.checkout > 0 order by b.checkout asc")
@Data
@Entity
@Table(name = "book_table")
public class BookModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "authorId")
    private List<AuthorModel> authors;

    private String photo;
    private String type;
    private int price;
    private int available;
    private int checkout;





}
