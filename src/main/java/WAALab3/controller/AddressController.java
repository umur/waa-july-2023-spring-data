package WAALab3.controller;

import WAALab3.entity.Address;
import WAALab3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addresss")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping
    public List<Address> findAll(){
        return addressService.findAll();
    }

    @GetMapping("{id}")
    public Address findById(@PathVariable Long id){
        return addressService.findById(id);
    }

    @PostMapping
    public void create(@RequestBody Address address){
        addressService.create(address);
    }

    @PutMapping("{id}")
    public void update(@RequestBody Address address){
        addressService.update(address);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        addressService.delete(id);
    }
}
