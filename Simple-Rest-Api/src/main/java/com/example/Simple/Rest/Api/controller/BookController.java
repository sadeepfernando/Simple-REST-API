package com.example.Simple.Rest.Api.controller;

import com.example.Simple.Rest.Api.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookRepo bookRepo;

    @GetMapping
    public void getAllBooks(){

    }

    @GetMapping
    public void getBookById(){

    }

    @PostMapping
    public void addBook(){

    }

    @PostMapping
    public void updateBookById(){

    }

    @DeleteMapping
    public void deleteBookById(){

    }

}
