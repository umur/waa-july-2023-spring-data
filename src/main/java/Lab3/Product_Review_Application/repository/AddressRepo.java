package Lab3.Product_Review_Application.repository;

import Lab3.Product_Review_Application.entity.Address;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends ListCrudRepository <Address, Integer> {
}
