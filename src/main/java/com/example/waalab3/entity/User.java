package com.example.waalab3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Table(name = "users")
@Setter
@Getter
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastname;
    private String email;
    private String password;
    @OneToOne
    @JsonBackReference
    private Address address;
    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Review> reviews;

}
