package com.rashad.store;

import com.rashad.store.repositories.UserRepository;
import com.rashad.store.services.AddressService;
import com.rashad.store.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(StoreApplication.class, args);
        var repository = context.getBean(UserRepository.class);
        var addressService = context.getBean(AddressService.class);
        var userService = context.getBean(UserService.class);
        // first way
//        var user = new User();
//        user.setName("Ahmed");
//        user.setEmail("ahmed@gmail.com");
//        user.setPassword("12345");

        // select one
//        var user = repository.findById(2L).orElseThrow();
//        System.out.println(user.getName());
//
//        repository.deleteById(1L);
//
//        // select all
//        repository.findAll().forEach((User u) -> System.out.println(u.getName()));

//        addressService.createAddress(new Address(null,"street", "city","zip_code", "state", user));
//        addressService.getAddress();

//        userService.presistRelated();
//        userService.deleteRelated();
        userService.deleteChild();
    }


}
