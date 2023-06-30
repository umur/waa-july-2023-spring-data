package com.waa.assignment_three.repository;

import com.waa.assignment_three.entity.Address;
import com.waa.assignment_three.entity.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepo extends ListCrudRepository<Address, Long> {
//    void updateById(Long id, Address address);

}
