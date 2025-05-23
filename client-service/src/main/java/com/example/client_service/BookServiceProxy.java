package com.example.client_service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookServiceProxy {
    private final BookServiceClient bookServiceClient;

    public BookServiceProxy(BookServiceClient bookServiceClient) {
        this.bookServiceClient = bookServiceClient;
    }

    @CircuitBreaker(name = "bookServiceClient", fallbackMethod = "fallbackBooks")
    @Retry(name = "bookServiceClient")
    public List<Object> getBooks() {
        return bookServiceClient.getBooks();
    }

    public List<Object> fallbackBooks(Exception t) {
        System.out.println("Fallback triggered! Exception: " + t);
        return List.of("Fallback: Book service unavailable");
    }
} 