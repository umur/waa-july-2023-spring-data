package Lab3.Product_Review_Application.service.impl;

import Lab3.Product_Review_Application.entity.Address;
import Lab3.Product_Review_Application.repository.AddressRepo;
import Lab3.Product_Review_Application.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    @Override
    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressRepo.findAll();
    }

    @Override
    public void updateAddress(int id) {

    }

    @Override
    public void deleteAddress(int id) {
        addressRepo.deleteById(id);
    }
}
