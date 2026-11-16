package com.rashad.store.repositories;

import com.rashad.store.entities.Product;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByName(String name);
    List<Product> findByNameIgnoreCase(String name);

    List<Product> findByNameLikeIgnoreCase(String name);

    List<Product> findByPrice(BigDecimal price);


    @Procedure("findProductsByPrice")
    List<Product> findProducts (BigDecimal min, BigDecimal max);
}