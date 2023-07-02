package lab3.service;
import lab3.entity.Address;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface AddressService {

    public List<Address> getAll();
    public Optional<Address> findById(Long id);
    public Address create(Address address);
    public Optional<Address> update(Long id,Address address);
    public void deleteById(Long id);

}
