package com.library.librarymanagementsystem.controller;

import org.springframework.stereotype.Controller;
import com.library.librarymanagementsystem.model.Author;
import com.library.librarymanagementsystem.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller //Returns name of a View which renders the HTML content
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @GetMapping // no (""), On http://localhost:8080/authors will display all authors
    public String getAllAuthors(Model model) {
        List<Author> authors = authorRepository.findAll();
        model.addAttribute("authors", authors);
        return "author-list";
    }

    @GetMapping("/{id}")
    public String getAuthorById(@PathVariable Long id, Model model) {
        Author author = authorRepository.findById(id).orElse(null);
        model.addAttribute("author", author);
        return "author-details";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("author", new Author());
        return "author-create";
    }

    @PostMapping("/create")
    public String createAuthor(@ModelAttribute("author") Author author) {
        authorRepository.save(author);
        return "redirect:/authors";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Author author = authorRepository.findById(id).orElse(null);
        model.addAttribute("author", author);
        return "author-update";
    }

    @PostMapping("/update/{id}")
    public String updateAuthor(@PathVariable Long id, @ModelAttribute("author") Author updatedAuthor) {
        Author author = authorRepository.findById(id).orElse(null);
        if (author != null) {
            author.setName(updatedAuthor.getName());
            authorRepository.save(author);
        }
        return "redirect:/authors";
    }


    @GetMapping("/confirm-delete/{id}")
    public String showDeleteForm(@PathVariable Long id, Model model) {
        Author author = authorRepository.findById(id).orElse(null);
        model.addAttribute("author", author);
        return "author-delete";
    }

    @GetMapping("/delete")
    public String showDeleteAuthors(Model model) {
        List<Author> authors = authorRepository.findAll();
        model.addAttribute("authors", authors);
        return "author-delete";
    }

    @PostMapping("/delete/{id}")
    public String deleteAuthor(@PathVariable Long id) {
        authorRepository.deleteById(id);
        return "redirect:/authors";
    }

}




//    @GetMapping("/delete/{id}")
//    public String deleteAuthor(@PathVariable Long id) {
//        authorRepository.deleteById(id);
//        return "redirect:/authors";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteAuthor(@PathVariable("id") Long id) {
//        authorRepository.deleteById(id);
//        return "redirect:/authors";
//    }