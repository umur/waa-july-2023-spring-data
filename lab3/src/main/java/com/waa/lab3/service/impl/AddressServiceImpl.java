package com.waa.lab3.service.impl;

import com.waa.lab3.model.Address;
import com.waa.lab3.repository.AddressRepo;
import com.waa.lab3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    @Override
    public List<Address> findALL() {
        return (List<Address>) addressRepo.findAll();
    }

    @Override
    public Optional<Address> findByID(int id) {
        return addressRepo.findById(id);
    }

    @Override
    public Address save(Address address) {
        addressRepo.save(address);
        return address;
    }

    @Override
    public void delete(int id) {
        addressRepo.deleteById(id);
    }
}
