package com.rashad.store;

import com.rashad.store.repositories.UserRepository;
import com.rashad.store.services.AddressService;
import com.rashad.store.services.ProductService;
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
        var productService = context.getBean(ProductService.class);



//        userService.presistRelated();
//        userService.deleteRelated();
//        userService.deleteChild();
//        productService.createProduct();
//        userService.addProductsToWishlist();

        productService.deleteProduct();
    }


}
