package com.example.AuthorMangement.Controller;

import com.example.AuthorMangement.Dto.AuthorDto;
import com.example.AuthorMangement.Model.Author;
import com.example.AuthorMangement.Repository.AuthorRepo;
import com.example.AuthorMangement.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @Autowired
    AuthorRepo authorRepo;

     @PostMapping("/add")
    public  String addAuthor(@RequestBody AuthorDto authorDto){

        return authorService.addAuthor(authorDto);

    }

    @GetMapping("/get")

    public Author get() {


         return authorRepo.findById(2).get();


    }
}
