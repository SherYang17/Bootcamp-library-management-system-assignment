package com.library.librarymanagementsystem.repository;

import com.library.librarymanagementsystem.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AuthorRepository extends JpaRepository<Author, Long> {
}
