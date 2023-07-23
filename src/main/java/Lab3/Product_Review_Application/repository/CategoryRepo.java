package Lab3.Product_Review_Application.repository;

import Lab3.Product_Review_Application.entity.Category;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends ListCrudRepository<Category,Integer> {
}
