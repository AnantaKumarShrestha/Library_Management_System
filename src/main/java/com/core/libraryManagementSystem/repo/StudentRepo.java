package com.core.libraryManagementSystem.repo;

import com.core.libraryManagementSystem.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface StudentRepo extends JpaRepository<StudentModel, UUID> {
}
