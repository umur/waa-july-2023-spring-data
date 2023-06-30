package com.waa.assignment_three.service;

import com.waa.assignment_three.entity.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface AddressService {

    List<Address> findAll();

//    void updateById(Long id, Address address);

    void updateById(Long id, Address address);

    void save(Address address);

    void deleteById(Long id);
}
