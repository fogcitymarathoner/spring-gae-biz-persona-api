package com.fogtest.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private static List<Book> books = new ArrayList<>();

    private static List<BookCategory> bookCategories = new ArrayList<>();
    private com.fogtest.api.BookCategoryRepository bookCategoryRepository;
    public BookController(BookCategoryRepository bookCategoryRepository){
        super();
        this.bookCategoryRepository = bookCategoryRepository;
    }
    @GetMapping
    public String getAllBooks(Model model){
        this.bookCategoryRepository.findAll().forEach(bookCategories::add);
        model.addAttribute("bookCategories", bookCategories);
        return "books";
    }
}