package com.rashad.store;

import com.rashad.store.entities.Address;
import com.rashad.store.entities.Tag;
import com.rashad.store.entities.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context =  SpringApplication.run(StoreApplication.class, args);

        // first way
        var user = new User();
        user.setName("Mohamed");
        user.setEmail("mohamed@gmail.com");
        user.setPassword("12345");

        // second using constructor
//        var user2 = new User(1,"Ahmed","ahmed@gmail.com","12345");

        // third using builder pattern

        var user3 = User.builder().name("Rashad").email("rashad@gmail.com").password("12345").build();
        var address = Address.builder()
                .city("Cairo")
                .state("Cairo")
                .street("salah salem")
                .zip("21343")
                .build();

        user3.addAddress(address);
        user3.addTag("tag-1");

        System.out.println(user3);

    }

}
