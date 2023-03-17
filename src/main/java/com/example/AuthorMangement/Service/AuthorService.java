package com.example.AuthorMangement.Service;

import com.example.AuthorMangement.Dto.AuthorDto;
import com.example.AuthorMangement.Model.Author;
import com.example.AuthorMangement.Repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepo authorRepo;

    public String addAuthor(AuthorDto authorDto){

        Author author=new Author();
        author.setName(authorDto.getName());
        author.setAge(authorDto.getAge());
        author.setRating(authorDto.getRating());
        authorRepo.save(author);
        return  "author done";

    }



}
