package Lab3.Product_Review_Application.service;

import Lab3.Product_Review_Application.entity.Address;

import java.util.List;

public interface AddressService {
    void addAddress(Address address);
    List<Address> getAllAddresses();

    void updateAddress(int id);
    void deleteAddress(int id);

}
