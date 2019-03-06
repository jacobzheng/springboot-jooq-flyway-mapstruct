package com.daqinshang.controller;

import com.daqinshang.domain.Book;
import com.daqinshang.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: jacobzheng
 * @Date: 2019/2/14 16:08
 * @Description:
 */
@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @PostMapping("/books")
    public String saveBook(){
        return bookService.saveBook();
    }
}
