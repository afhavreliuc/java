package com.example.book_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/books")
public class BookController {
    @Value("${server.port}")
    private String port;

    @GetMapping
    public List<String> getBooks() {
        log.info("Request for books received on port {}", port);
        return List.of("Book 1 from port " + port, "Book 2 from port " + port, "Book 3 from port " + port);
    }
} 