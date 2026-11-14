package com.rashad.store.services;


import com.rashad.store.entities.Category;
import com.rashad.store.entities.Product;
import com.rashad.store.repositories.AddressRepository1;
import com.rashad.store.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final AddressRepository1 categoryRepository;

    public ProductService(ProductRepository productRepository, AddressRepository1 categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Transactional
    public void createProduct(){

        // Q1
//        var category = Category.builder()
//                .name("Tech")
//                .build();
//
//
//        var product = Product.builder()
//                .name("Product_2")
//                .price(BigDecimal.valueOf(10.44))
//                .description("this is the description")
//                .category(category)
//                .build();
//
//        productRepository.save(product);



        // Q2
        var category = categoryRepository.findById((byte) 1).orElseThrow();

        var product = Product.builder()
                .name("Product_3")
                .price(BigDecimal.valueOf(22))
                .description("this is the description")
                .category(category)
                .build();

        productRepository.save(product);
    }

    //Q4
    public void deleteProduct(){
        productRepository.deleteById(4L);
    }
}
