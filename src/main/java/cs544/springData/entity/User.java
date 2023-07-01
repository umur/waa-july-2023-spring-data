package cs544.springData.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Double amount;
    private String password;
    private String firstName;
    private String lastName;
//    @JsonManagedReference
    @OneToMany(mappedBy = "user")
    private List<Review> review;
//    @JsonManagedReference
    @OneToOne
    private Address address;

}
