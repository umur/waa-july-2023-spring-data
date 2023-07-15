package online.moumini.spring.data.one.repository;

import online.moumini.spring.data.one.model.Category;
import org.springframework.data.repository.ListCrudRepository;

public interface CategoryRepository extends ListCrudRepository<Category, Long> {

}
