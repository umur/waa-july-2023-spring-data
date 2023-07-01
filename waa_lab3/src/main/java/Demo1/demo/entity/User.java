package Demo1.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@Table(name="user")
public class User {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
    private String id;
    private String email;
    private String password;
    private String firstName;
    private String lastname;
//    @JoinColumn()
    @OneToMany(mappedBy = "user")
    private List<Review> reviews;
//   @JoinColumn(name = "address_id")
    @OneToOne()
    private Address address;

}
