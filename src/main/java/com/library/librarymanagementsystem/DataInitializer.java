package com.library.librarymanagementsystem;

import com.library.librarymanagementsystem.model.Author;
import com.library.librarymanagementsystem.model.Book;
import com.library.librarymanagementsystem.repository.AuthorRepository;
import com.library.librarymanagementsystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializer {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public void initData() {
        // Create and save authors
        Author author1 = new Author("Author 1");
        Author author2 = new Author("Author 2");
        authorRepository.saveAll(Arrays.asList(author1, author2));

        // Create and save books
        Book book1 = new Book("Book 1", author1);
        Book book2 = new Book("Book 2", author2);
        bookRepository.saveAll(Arrays.asList(book1, book2));
    }
}
