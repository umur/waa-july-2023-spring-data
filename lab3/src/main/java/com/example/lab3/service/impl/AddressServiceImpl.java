package com.example.lab3.service.impl;

import com.example.lab3.entity.Address;
import com.example.lab3.repository.AddressRepository;
import com.example.lab3.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class AddressServiceImpl implements AddressService {

    public AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository){
        this.addressRepository=addressRepository;
    }

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Address getAddressById(Long id) {
        return addressRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Address not found with id: " + id));
    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address updateAddress(Long id, Address updatedAddress) {
        Address existingAddress = getAddressById(id);
        existingAddress.setStreet(updatedAddress.getStreet());
        existingAddress.setZip(updatedAddress.getZip());
        existingAddress.setCity(updatedAddress.getCity());
        existingAddress.setUser(updatedAddress.getUser());
        return addressRepository.save(existingAddress);
    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}
