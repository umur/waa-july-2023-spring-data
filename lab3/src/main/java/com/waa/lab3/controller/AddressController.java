package com.waa.lab3.controller;

import com.waa.lab3.model.Address;
import com.waa.lab3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping
    public List<Address> findAll() {
        return addressService.findALL();
    }

    @GetMapping("/{id}")
    public Optional<Address> findByID(@PathVariable int id) {
        return addressService.findByID(id);
    }

    @PostMapping
    public void createAddress(@RequestBody Address address) {
        addressService.save(address);
    }

    @PutMapping("/{id}")
    public Address updateAddress(@PathVariable int id, @RequestBody Address address){
        address.setId(id);
       return addressService.save(address);
    }

    @DeleteMapping("/{id}")
        public void deleteAddress(@PathVariable int id){
            addressService.delete(id);
        }
    }


