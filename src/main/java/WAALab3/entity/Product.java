package WAALab3.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
//@Table(name=)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int price;
    //@Column(name=)
    private double rating;

    //@JsonManagedReference
    //@JoinColumn
    @OneToMany(mappedBy = "product")
    @JsonManagedReference
    private List<Review> reviews;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonBackReference
    private Category category;
}
