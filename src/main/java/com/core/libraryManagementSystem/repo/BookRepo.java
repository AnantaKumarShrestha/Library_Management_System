package com.core.libraryManagementSystem.repo;

import com.core.libraryManagementSystem.model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BookRepo extends JpaRepository<BookModel, UUID> {

//    List<BookModel> findByTypes(String type);

    @Query( name = "availableBooks")
    List<BookModel> getBooksAvailableInLibrary();

//    @Query(name = "checkoutBooks")
//    List<BookModel> getCheckoutBooks();

    @Query("select b.id,b.name,b.available from BookModel b where b.available > 0 order by b.available asc")
    List<BookModel> getCheckoutBooks();

}
