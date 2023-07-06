package com.waa.lab3.service;

import com.waa.lab3.model.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {
    List<Address> findALL();

    Optional<Address> findByID(int id);

    Address save(Address address);


    void delete(int id);
}
