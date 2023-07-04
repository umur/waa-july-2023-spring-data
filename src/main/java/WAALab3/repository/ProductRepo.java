package WAALab3.repository;

import WAALab3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends ListCrudRepository<Product, Long> {


    List<Product> findAllByPriceGreaterThan(int minPrice);

    List<Product> findAllByCategory_IdAndPriceLessThan(Long categoryId , int maxPrice);

    List<Product> findAllByNameContaining(String keyword);




}
