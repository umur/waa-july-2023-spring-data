package Lab3.Product_Review_Application.controller;

import Lab3.Product_Review_Application.entity.Address;
import Lab3.Product_Review_Application.service.AddressService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    private AddressService addressService;

    @PostMapping
    public void addAddress(Address address){
        addressService.addAddress(address);
    }

    @GetMapping
    public List<Address> getAddresses(){
        return addressService.getAllAddresses();
    }

    @PutMapping("/{id}")
    public void updateAddress(@PathVariable int id){
        addressService.updateAddress(id);
    }

    @DeleteMapping
    public void deleteAddress(int id){
        addressService.deleteAddress(id);
    }
}
