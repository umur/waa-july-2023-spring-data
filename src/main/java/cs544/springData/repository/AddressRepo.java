package cs544.springData.repository;

import cs544.springData.entity.Address;
import cs544.springData.entity.Product;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends ListCrudRepository<Address,Long> {
}
