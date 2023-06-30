package com.waa.assignment_three.controller;

import com.waa.assignment_three.entity.Address;
import com.waa.assignment_three.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
@RequiredArgsConstructor
public class AddressController {
    private final AddressService addressService;

    @GetMapping
    public List<Address> findAll(){
        return addressService.findAll();
    }

    @PostMapping
    public void save(@RequestBody Address address){
        addressService.save(address);
    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable Long id, @RequestBody Address address){
        addressService.updateById(id, address);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        addressService.deleteById(id);
    }
}
