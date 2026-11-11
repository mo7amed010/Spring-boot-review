package com.rashad.store;

import com.rashad.store.entities.User;
import com.rashad.store.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(StoreApplication.class, args);
        var repository = context.getBean(UserRepository.class);
        // first way
//        var user = new User();
//        user.setName("Ahmed");
//        user.setEmail("ahmed@gmail.com");
//        user.setPassword("12345");

        // select one
        var user = repository.findById(1L).orElseThrow();
        System.out.println(user.getName());

        repository.deleteById(1L);

        // select all
        repository.findAll().forEach((User u) -> System.out.println(u.getName()));
    }

}
