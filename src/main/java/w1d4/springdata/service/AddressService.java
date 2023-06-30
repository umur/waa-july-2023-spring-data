package w1d4.springdata.service;

import w1d4.springdata.entity.Address;

import java.util.List;

public interface AddressService {
    Address create(Address address);

    List<Address> findAll();

    Address findById(Long id);

    Address update(Long id, Address address);

    void delete(Long id);
}
