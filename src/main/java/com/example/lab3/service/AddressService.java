package com.example.lab3.service;

import com.example.lab3.entity.Address;
import com.example.lab3.entity.Category;

import java.util.List;
import java.util.Optional;

public interface AddressService {

    List<Address> getAllAddresses();

    Optional<Address> getAddressById(long addressId);

    void create(Address address);

    Address update(Address address);

    void delete(long addressId);
}
