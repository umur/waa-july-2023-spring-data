package cs545.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Double price;
    private Integer rating;

    @JsonManagedReference
    @ManyToOne
    private Category category;

    @JsonBackReference
    @OneToMany(mappedBy = "product")
    private List<Review> reviews;


}
