package lab3.controller;

import lab3.entity.Address;
import lab3.service.AddressService;
import lab3.utils.CustomError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/categories")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(addressService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable(name = "id") Long id) {
        Optional<Address> address = addressService.findById(id);
        if (address.isPresent()) {
            return ResponseEntity.ok(address.get());
        }
        return new ResponseEntity<>(new CustomError("Address " + id + " not found"), HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Address address) {
        return ResponseEntity.ok(addressService.create(address));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody Address address) {
        return ResponseEntity.ok(addressService.update(id,address));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long addressId) {
        addressService.deleteById(addressId);
    }
}

