package com.example.client_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "book-service")
public interface BookServiceClient {
    @GetMapping("/api/books")
    List<Object> getBooks(); // Poți crea un DTO pentru Book dacă vrei tipare mai clare
}
