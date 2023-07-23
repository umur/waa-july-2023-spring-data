package Lab3.Product_Review_Application.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Long price;
    private int rating;
    @ManyToOne
    @JsonBackReference
    private Category category;
    @OneToMany(mappedBy = "product")
    @JsonManagedReference
    private List<Review> reviews;
}
