package com.example.waalab3.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Data
@Entity
@Table(name = "products")
@JsonIgnoreProperties("hibernateInitializer")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String rating;

    @ManyToOne
    @JsonManagedReference
    private Category category;
    @OneToMany(mappedBy = "product")
    @JsonManagedReference
    private List<Review> reviews;
}
