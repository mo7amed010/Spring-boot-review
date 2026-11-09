package com.rashad.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(StoreApplication.class, args);
//        var order = context.getBean(OrderService.class);
//        order.placeOrder();

//        var notificationService = context.getBean(NotificationManager.class);
//        notificationService.snedNotification("test");

        var userService = context.getBean(UserService.class);
        userService.registerUser(new User(1,"mohamed.a@wtm.llc", "12345678", "Mohamed"));
//        userService.registerUser(new User(1,"mohamed.a@wtm.llc", "12345678", "Mohamed"));
    }

}
