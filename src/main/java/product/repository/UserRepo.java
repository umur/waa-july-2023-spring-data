package product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import product.entity.User;

public interface UserRepo extends JpaRepository<User, Long>{
}
