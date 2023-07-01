package com.example.demo.service.impls;

import com.example.demo.repository.AddressRepository;
import com.example.demo.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
}
