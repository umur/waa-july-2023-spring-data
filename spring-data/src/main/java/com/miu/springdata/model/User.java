package com.miu.springdata.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    @JoinColumn(name = "user_id")
    @OneToMany
    private List<Review> reviews;
    @OneToOne
    private Address address;

}
