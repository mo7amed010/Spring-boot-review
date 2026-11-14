package com.rashad.store.services;

import com.rashad.store.entities.Address;
import com.rashad.store.repositories.AddressRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    private final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public void createAddress(Address address){
        var savedAddress = addressRepository.save(address);
    }

    @Transactional
    public void getAddress(){
        var address = addressRepository.findById(1L).orElseThrow();
        System.out.println("Fetched : " + address.getCity() );
        getRelatedUser(address);
    }

    public void getRelatedUser(Address address){
        System.out.println(address.getUser().getName());
    }
}
