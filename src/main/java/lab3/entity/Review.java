package lab3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Review {

    @Id
    @GeneratedValue()
    private Long id;
    private String comment;
    private float rating;

    @ManyToOne
    @JoinColumn
    @JsonBackReference
    private Product product;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn
    private User user;
}
