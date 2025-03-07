package com.bookstore.bookshop.controller;


import com.bookstore.bookshop.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class BookController {

    @GetMapping("/getBooks")
    public ResponseEntity<List<BookDto>> getBooks(){

        List<BookDto> bookDtos = new ArrayList<>();

        BookDto bookDto = BookDto.builder()
                .title("My Book")
                .build();

        bookDtos.add(bookDto);
        return ResponseEntity.ok(bookDtos);
    }
}
