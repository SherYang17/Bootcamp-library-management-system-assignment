package com.library.librarymanagementsystem.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;
import com.library.librarymanagementsystem.model.Book;
import com.library.librarymanagementsystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest request, Model model) {
        // Logic to handle the error and display appropriate error information
        // You can customize the error handling and error page as per your requirements
        model.addAttribute("errorMessage", "Oops! Something went wrong. Tough luck, Spring is hard lol.");
        return "error";
    }

//    @Override
//    public String getErrorPath() {
//        return "/error";
//    }
}

