package com.example.client_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BookProxyController {
    private final BookServiceClient bookServiceClient;

    public BookProxyController(BookServiceClient bookServiceClient) {
        this.bookServiceClient = bookServiceClient;
    }

    @GetMapping("/proxy/books")
    public List<Object> proxyBooks() {
        return bookServiceClient.getBooks();
    }
}
