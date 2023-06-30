package w1d4.springdata.entity;

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
    private long id;

    private String email, password, firstName, lastname;

    @OneToOne
    private Address address;

    @OneToMany(mappedBy = "user")
    private List<Review> reviews;
}
