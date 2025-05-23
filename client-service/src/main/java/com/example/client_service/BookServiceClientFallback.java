package com.example.client_service;

import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class BookServiceClientFallback implements BookServiceClient {
    @Override
    public List<Object> getBooks() {
        return List.of("Fallback: Book service unavailable");
    }
}
