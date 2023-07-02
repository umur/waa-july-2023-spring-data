package lab3.service;

import lab3.entity.Address;
import lab3.entity.Category;
import lab3.entity.Product;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {

    public List<Product> getAll();
    public Optional<Product> findById(Long id);
    public Product create(Product product);
    public Optional<Product>  update(Long id, Product product);
    public void deleteById(Long id);

    List<Product> getByMinPrice(Double price);
    List<Product> getByCategoryAndMaxPrice(Long catId, Double price);
    List<Product> getByKeyword(String keyword);
}
