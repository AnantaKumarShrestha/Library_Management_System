package com.core.libraryManagementSystem.model;

import com.core.libraryManagementSystem.Encryption.EncryptorDecryptor;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "student_table")
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;

    @Convert(converter = EncryptorDecryptor.class)
    private String email;

    @Convert(converter = EncryptorDecryptor.class)
    private String phone;

    @CreatedDate
    private LocalDate accOpenDate;


    @OneToOne(cascade = CascadeType.ALL)
    private AddressModel address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "booksId")
    private List<BookModel> books;




}
