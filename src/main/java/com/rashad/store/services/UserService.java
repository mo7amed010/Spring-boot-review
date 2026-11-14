package com.rashad.store.services;

import com.rashad.store.entities.Address;
import com.rashad.store.entities.User;
import com.rashad.store.repositories.AddressRepository;
import com.rashad.store.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final AddressService addressService;
    private final AddressRepository addressRepository;

    public UserService(UserRepository userRepository, AddressService addressService, AddressRepository addressRepository) {
        this.userRepository = userRepository;
        this.addressService = addressService;
        this.addressRepository = addressRepository;
    }

    public void presistRelated(){
        var user = User.builder()
                .name("Mohamed")
                .email("mohamed@gmail.com")
                .password("12345")
                .build();

        var address = Address.builder()
                .street("street 2")
                .city("city_2")
                .state("State_2")
                .zip("21")
                .build();

        user.addAddress(address);

        userRepository.save(user);
    }

    public void deleteRelated(){
        userRepository.deleteById(3L);
    }

    @Transactional
    public void deleteChild(){
        var user = userRepository.findById(4L).orElseThrow();

        var adddress = user.getAddresses().getFirst();

        user.removeAddress(adddress);
        userRepository.save(user);
    }
}
