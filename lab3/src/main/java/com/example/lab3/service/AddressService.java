package com.example.lab3.service;

import com.example.lab3.entity.Address;

import java.util.List;

public interface AddressService {
    public List<Address> getAllAddresses();
    public void deleteAddress(Long id);
    public Address updateAddress(Long id,Address updatedAddress);
    public Address createAddress(Address address);
}
