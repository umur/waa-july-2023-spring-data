package online.moumini.spring.data.one.repository;

import online.moumini.spring.data.one.model.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User, Long> {

}
