package com.miu.springdata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private double rating;
    @JoinColumn(name = "product_id")
    @OneToMany
    private List<Review> reviews;

    @ManyToOne
    private Category category;
}
