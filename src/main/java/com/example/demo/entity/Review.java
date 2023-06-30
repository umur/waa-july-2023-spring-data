package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String content;
    @ManyToOne
    private User user;
    @ManyToOne
    private Product product;


//
//    @JoinColumn(name="product_id")  // we use joinColumn to escape the joining table and we put in the strong side if its
//    @OneToMany
//    private Product product;


}
