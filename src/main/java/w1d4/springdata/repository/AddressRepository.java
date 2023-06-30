package w1d4.springdata.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import w1d4.springdata.entity.Address;

@Repository
public interface AddressRepository extends ListCrudRepository<Address, Long> {
}
