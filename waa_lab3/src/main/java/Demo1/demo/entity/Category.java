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
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
  private Long  categoryId;
     private String name;
@JoinColumn()
     @OneToMany()
    private List<Product> products;

}
