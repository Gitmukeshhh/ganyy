package com.example.AuthorMangement.Model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;

    private  String name;
    private  int pages;
    private  int rating;

    @ManyToOne
    @JoinColumn
    private  Author author;






}
