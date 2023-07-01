package com.example.lab3.controller;

import com.example.lab3.entity.Address;
import com.example.lab3.service.AddressService;
import com.example.lab3.utils.CustomErrorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping
    public ResponseEntity<?> getAllAddresses() {
        return ResponseEntity.ok(addressService.getAllAddresses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAddressById(@PathVariable(name = "id") Long addressId) {
        Optional<Address> address = addressService.getAddressById(addressId);
        if (address.isPresent()) {
            return ResponseEntity.ok(address.get());
        }
        return new ResponseEntity<>(new CustomErrorType("Address " + addressId + " not found"), HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public void create(@RequestBody Address address) {
        addressService.create(address);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Address address) {
        return ResponseEntity.ok(addressService.update(address));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long addressId) {
        addressService.delete(addressId);
    }
}
