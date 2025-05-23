package com.example.client_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BookProxyController {
    private final BookServiceProxy bookServiceProxy;

    public BookProxyController(BookServiceProxy bookServiceProxy) {
        this.bookServiceProxy = bookServiceProxy;
    }

    @GetMapping("/proxy/books")
    public List<Object> proxyBooks() {
        try {
            return bookServiceProxy.getBooks();
        } catch (Exception e) {
            System.out.println("Manual fallback triggered! Exception: " + e);
            return List.of("Manual fallback: Book service unavailable");
        }
    }
}
