package com.example.waalab3.service;

import com.example.waalab3.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> getAllAddress();
    Address getAddressById(Long id);
    Address saveAddress(Address address);
    Address updateAddress(Address address);
    void deleteAddressById(Long id);
}
