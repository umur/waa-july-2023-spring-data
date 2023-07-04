package WAALab3.service;

import WAALab3.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> findAll();

    Address findById(Long id);

    void create(Address address);

    void update(Address address);

    void delete(Long id);
}
