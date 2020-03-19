package com.mthiam.microcommerce.dao;

import com.mthiam.microcommerce.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductDaoI implements ProductDao {
    public static List<Product> products=new ArrayList<>();
    static {
        products.add(new Product(1, new String("Ordinateur portable"), 350));
        products.add(new Product(2, new String("Aspirateur Robot"), 500));
        products.add(new Product(3, new String("Table de Ping Pong"), 750));
    }

    @Override
    public List<Product>findAll() {
        return products;
    }

    @Override
    public Optional<Product> findById(int id) {
        for (Product product : products) {
            if(product.getId() == id){
                return Optional.of(product);
            }
        }
        return null;
    }

    @Override
    public Product save(Product product) {
        products.add(product);
        return product;
    }
}
