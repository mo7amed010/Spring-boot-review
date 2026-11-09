package com.rashad.store;

import com.rashad.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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
        var user2 = new User(1,"Ahmed","ahmed@gmail.com","12345");

        // third using builder pattern

        var user3 = User.builder().name("Rashad").email("rashad@gmail.com").password("12345").build();

        System.out.println("user1 : " + user.getName());
        System.out.println("user2 : " + user2.getName());
        System.out.println("user3 : " + user3.getName());

    }

}
