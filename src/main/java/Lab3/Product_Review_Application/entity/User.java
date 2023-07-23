package Lab3.Product_Review_Application.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String firstname;
    private String lastname;
    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    private List<Review> reviews;
    @OneToOne(mappedBy = "user")
    @JsonManagedReference
    private Address address;
}