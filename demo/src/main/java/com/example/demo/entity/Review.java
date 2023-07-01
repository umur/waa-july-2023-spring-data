package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;
    private  String comment;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;


}

