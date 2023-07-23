package Lab3.Product_Review_Application.repository;

import Lab3.Product_Review_Application.entity.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepo extends ListCrudRepository<User,Integer> {
}
