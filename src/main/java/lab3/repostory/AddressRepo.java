package lab3.repostory;

import jakarta.transaction.Transactional;
import lab3.entity.Address;
import lab3.entity.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends ListCrudRepository<Address, Long> {
//    List<Product> findAllByPriceGreaterThan(int price);
}