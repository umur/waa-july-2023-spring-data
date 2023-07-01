package com.example.lab3.service.impl;

import com.example.lab3.entity.Address;
import com.example.lab3.repository.AddressRepository;
import com.example.lab3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository repository;

    @Override
    public List<Address> getAllAddresses() {
        return repository.findAll();
    }

    @Override
    public Optional<Address> getAddressById(long addressId) {
        return repository.findById(addressId);
    }

    @Override
    public void create(Address address) {
        repository.save(address);
    }

    @Override
    public Address update(Address address) {
        return repository.save(address);
    }

    @Override
    public void delete(long addressId) {
        repository.deleteById(addressId);
    }
}
