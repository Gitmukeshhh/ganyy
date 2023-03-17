package com.example.AuthorMangement.Controller;


import com.example.AuthorMangement.Dto.BookDto;
import com.example.AuthorMangement.Model.Author;
import com.example.AuthorMangement.Service.AuthorService;
import com.example.AuthorMangement.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;


    @GetMapping("/get")
    public  String  addBook(@RequestBody BookDto bookDto){


        return  bookService.addBook(bookDto);
    }
}
