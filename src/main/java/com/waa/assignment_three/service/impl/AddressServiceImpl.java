package com.waa.assignment_three.service.impl;

import com.waa.assignment_three.entity.Address;
import com.waa.assignment_three.entity.Category;
import com.waa.assignment_three.repository.AddressRepo;
import com.waa.assignment_three.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepo addressRepo;
    @Override
    public List<Address> findAll() {
        return addressRepo.findAll();
    }

    @Override
    public void updateById(Long id, Address address) {
        Optional<Address> existingAddress = addressRepo.findById(id);
        if(existingAddress.isEmpty()) throw new RuntimeException("The address doesn't exist");

        existingAddress.get().setCity(address.getCity());
        existingAddress.get().setZip(address.getZip());
        existingAddress.get().setStreet(address.getStreet());

        addressRepo.save(existingAddress.get());
    }

    @Override
    public void save(Address address) {
        addressRepo.save(address);
    }

    @Override
    public void deleteById(Long id) {
        addressRepo.deleteById(id);
    }
}
