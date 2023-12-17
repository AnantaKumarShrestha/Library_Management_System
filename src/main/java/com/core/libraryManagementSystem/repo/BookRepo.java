package com.core.libraryManagementSystem.repo;

import com.core.libraryManagementSystem.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookRepo extends JpaRepository<BookModel, UUID> {
}
