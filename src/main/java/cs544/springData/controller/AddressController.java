package cs544.springData.controller;

import cs544.springData.entity.Address;
import cs544.springData.service.AddresService;
import cs544.springData.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class AddressController {
    @Autowired
    private AddresService addressService;

    @GetMapping("/addresses")
    public List<Address> getAdress(){
        return addressService.getAddress();
    }
    @PostMapping("/addresses")
    public Address addAddress(@RequestBody Address address){
       addressService.addAddress(address);
       return address;
    }
    @GetMapping("/addresses/{id}")
    public Address getAddressById(@PathVariable Long id){
        return addressService.getById(id);
    }
    @PutMapping("/addresses/{id}")
    public Address updateAddress(@PathVariable Long id,@RequestBody Address address){
        return addressService.updateAddress(id,address);

    }
    @DeleteMapping("/addresses/{id}")
    public String deleteById(@PathVariable Long id){
        return addressService.DeleteById(id);
    }
}
