package cs544.springData.service;

import cs544.springData.entity.Address;

import java.util.List;

public interface AddresService {
    public List<Address> getAddress();
    public String addAddress(Address address );
    public Address updateAddress(Long id,Address address);
    public Address getById(Long id);
    public String DeleteById(Long id);
}
