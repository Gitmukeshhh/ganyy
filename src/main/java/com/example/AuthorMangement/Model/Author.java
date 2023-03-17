package com.example.AuthorMangement.Model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "author")
@Data
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private  String name;
    private  int age;
    private  int rating;


    @OneToMany(mappedBy = "author" ,cascade = CascadeType.ALL)
    private List<Book> bookList=new ArrayList<>();


}
