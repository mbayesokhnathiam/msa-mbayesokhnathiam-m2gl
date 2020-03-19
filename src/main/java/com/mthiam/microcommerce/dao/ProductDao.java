package com.mthiam.microcommerce.dao;

import com.mthiam.microcommerce.model.Product;

import java.util.List;
import java.util.Optional;


public interface ProductDao {
    public List<Product> findAll();
    public Optional<Product> findById(int id);
    public Product save(Product product);
}
