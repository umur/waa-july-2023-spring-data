package w1d4.springdata.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String comment;

    @ManyToOne
    private User user;

    @ManyToOne
    private Product product;
}
