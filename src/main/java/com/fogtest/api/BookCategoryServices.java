package com.fogtest.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookCategoryServices {

    private BookCategoryRepository bookCategoryRepository;

    @Autowired
    public BookCategoryServices(BookCategoryRepository bookCategoryRepository){
        super();
        this.bookCategoryRepository = bookCategoryRepository;
    }

    public List<BookCategory> getAllBookCategories(){
        List<BookCategory> bookCategories = new ArrayList<>();
        this.bookCategoryRepository.findAll().forEach(bookCategories::add);
        System.out.println(bookCategories);
        return bookCategories;
    }
}

