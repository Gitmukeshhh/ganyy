package com.example.AuthorMangement.Service;

import com.example.AuthorMangement.Dto.BookDto;
import com.example.AuthorMangement.Model.Author;
import com.example.AuthorMangement.Model.Book;
import com.example.AuthorMangement.Repository.AuthorRepo;
import com.example.AuthorMangement.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;

    @Autowired
    AuthorRepo authorRepo;

    public String  addBook(BookDto bookDto){



         Book book=new Book();
         book.setName(bookDto.getName());
         book.setPages(bookDto.getPages());
         book.setRating(bookDto.getRating());

        int id= bookDto.getId();
        Author author=  authorRepo.findById(id).get();


        book.setAuthor(author);

         List<Book> list=author.getBookList();
         list.add(book);
         author.setBookList(list);
         authorRepo.save(author);


         return "Done";





    }

}
