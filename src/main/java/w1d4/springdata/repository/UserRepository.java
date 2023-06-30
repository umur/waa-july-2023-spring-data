package w1d4.springdata.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import w1d4.springdata.entity.User;

@Repository
public interface UserRepository extends ListCrudRepository<User, Long> {
}
