package WAALab3.service.impl;

import WAALab3.entity.Address;
import WAALab3.repository.AddressRepo;
import WAALab3.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;

    @Override
    public List<Address> findAll(){
        return addressRepo.findAll();
    }

    @Override
    public Address findById(Long id){
        var res = addressRepo.findById(id);
        if(res.isPresent())
            return res.get();

        throw new NoSuchElementException("Address Not Found");
    }

    @Override
    public void create(Address address){

        if(address.getCity().isBlank())
            throw new IllegalArgumentException("City Cannot be Blank");

        if(address.getZip().isBlank())
            throw new IllegalArgumentException("Address Cannot be Blank");

        addressRepo.save(address);
    }

    @Override
    public void update(Address address){
        var prev = findById(address.getId());
        create(address);
    }

    @Override
    public void delete(Long id){
        addressRepo.deleteById(id);
    }
}
