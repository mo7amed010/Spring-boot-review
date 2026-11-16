package com.rashad.store.services;


import com.rashad.store.entities.Category;
import com.rashad.store.entities.Product;
import com.rashad.store.repositories.AddressRepository1;
import com.rashad.store.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

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

    public void testDerivedQueries(){
        var product = productRepository.findByNameLikeIgnoreCase("Product_2").getFirst();
        System.out.println(product);
    }

    @Transactional
    public void findAll(){
        var products = productRepository.findProducts(BigDecimal.valueOf(5), BigDecimal.valueOf(26));
        products.forEach(System.out::println);
    }

    public void findUsingExample(){
        var product = new Product();
        product.setName("Product");

        var mathcer = ExampleMatcher.matching()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        var example  = Example.of(product, mathcer);
        var products = productRepository.findAll(example);
        products.forEach(System.out::println);

    }

    public void getSortedProducts(){
        var sort = Sort.by("name").descending().and(
                Sort.by("price")
        );

        var products = productRepository.findAll(sort);
        products.forEach(System.out::println);
    }

    public void fetchPaginatedProducts(int pageNumber, int size){
        PageRequest pageRequest = PageRequest.of(pageNumber,size);
        Page<Product> page = productRepository.findAll(pageRequest);

        page.getContent().forEach(System.out::println);

        System.out.println("total pages: " + page.getTotalPages());
        System.out.println("total products: " + page.getTotalElements());
    }
}
