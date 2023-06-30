package com.example.waalab3.service.impl;

import com.example.waalab3.entity.Address;
import com.example.waalab3.repository.AddressRepository;
import com.example.waalab3.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;
    @Override
    public List<Address> getAllAddress() {
        //get all address
        return addressRepository.findAll();

    }

    @Override
    public Address getAddressById(Long id) {
        //address by id
        return addressRepository.getReferenceById(id);
    }

    @Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public Address updateAddress(Address address) {
        if (address.getId() == null) {
            throw new RuntimeException("Address id cannot be null");
        }
        Address address1 = addressRepository.getReferenceById(address.getId());
        address1.setId(address.getId());
        address1.setStreet(address.getStreet());
        address1.setCity(address.getCity());
        address1.setState(address.getState());
        address1.setZipCode(address.getZipCode());
        return addressRepository.save(address1);

    }

    @Override
    public void deleteAddressById(Long id) {
        addressRepository.deleteById(id);
    }
}
