package com.example.client_service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "book-service", configuration = FeignConfig.class)
public interface BookServiceClient {
    @GetMapping("/api/books")
    List<Object> getBooks();
}
