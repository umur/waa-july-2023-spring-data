package cs544.springData.repository;

import cs544.springData.entity.Category;
import cs544.springData.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  CategoryRepo extends ListCrudRepository<Category,Long> {

//    @Query("select c.products from Category  c join c.products p having p.price<max(p.price) and c=?1")
//    public List<Product> findByCategoryAndPriceLessThan(Category cat);

}
