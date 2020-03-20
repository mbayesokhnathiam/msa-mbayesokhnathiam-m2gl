package com.mthiam.microcommerce.dao;

import com.mthiam.microcommerce.model.Product;

import java.util.List;
import java.util.Optional;

/**
 * @author M.THIAM
 * @version 1.0.0
 */
public interface ProductDao {

    /**
     *
     * @return
     */
    public List<Product> findAll();

    /**
     *
     * @param id
     * @return
     */
    public Optional<Product> findById(int id);

    /**
     *
     * @param product
     * @return
     */
    public Product save(Product product);
}
