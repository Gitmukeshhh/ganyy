package com.example.AuthorMangement.Repository;

import com.example.AuthorMangement.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book ,Integer>{
}
