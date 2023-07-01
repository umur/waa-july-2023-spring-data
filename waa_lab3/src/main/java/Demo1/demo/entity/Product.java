package Demo1.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="product")
@Getter
@Setter
@RequiredArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long productId;
    private String name;
    private Double price;
    private String rating;
    @ManyToOne
    private Category category;
//    @JoinColumn()
    @OneToMany(mappedBy="product",cascade= CascadeType.ALL)
    private List<Review> reviews;
}
