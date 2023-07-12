package com.example.waalab3.controller;

import com.example.waalab3.entity.Address;
import com.example.waalab3.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping("/all")
    public List<Address> getAllAddress() {
        return addressService.getAllAddress();
    }

    @GetMapping("/{id}")
    public Address getAddressById(@PathVariable Long id) {
        return addressService.getAddressById(id);
    }
    @PostMapping("/save")
    public Address saveAddress(@RequestBody Address address) {
        return addressService.saveAddress(address);
    }
    @PutMapping("/update")
    public Address updateAddress(@RequestBody Address address) {
        return addressService.updateAddress(address);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteAddressById(@PathVariable Long id) {
        addressService.deleteAddressById(id);
    }

}
