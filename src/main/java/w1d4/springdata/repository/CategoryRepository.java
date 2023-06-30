package w1d4.springdata.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import w1d4.springdata.entity.Category;

@Repository
public interface CategoryRepository extends ListCrudRepository<Category, Long> {
}
