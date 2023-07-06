package com.w1d3.springdata.service.impl;

import com.w1d3.springdata.dto.AddressDto;
import com.w1d3.springdata.entity.Address;
import com.w1d3.springdata.repository.AddressRepo;
import com.w1d3.springdata.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private  final AddressRepo addressRepo;
    private final ModelMapper modelMapper;
    @Override
    public void save(Address address) {
    addressRepo.save(address);
    }

    @Override
    public List<AddressDto> findAll() {
        var addressList= (List<Address>)addressRepo.findAll();
        return addressList.stream().map(address -> modelMapper.map(address, AddressDto.class)).toList();
    }

    @Override
    public AddressDto findById(int id) {
        return modelMapper.map(addressRepo.findById(id).get(),AddressDto.class);
    }

    @Override
    public void deleteById(int id) {
    addressRepo.deleteById(id);
    }
}
