package com.example.book_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/books")
public class BookController {
    @GetMapping
    public List<String> getBooks() {
        log.info("Request for books received");
        return List.of("Book 1", "Book 2", "Book 3");
    }
} 