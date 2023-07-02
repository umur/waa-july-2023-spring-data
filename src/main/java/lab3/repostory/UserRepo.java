package lab3.repostory;

import lab3.entity.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends ListCrudRepository<User, Long> {
//    List<Product> findAllByPriceGreaterThan(int price);

//    @Query("")
//    List<Product>
}
