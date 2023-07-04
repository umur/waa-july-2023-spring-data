package WAALab3.entity;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String comment;

    //@JsonBackReference
    //@JoinColumn(name="product_id") //Optional if we don't want to change the reference name
    @ManyToOne
    @JsonBackReference
    private Product product;

    @ManyToOne
    private User user;
}
