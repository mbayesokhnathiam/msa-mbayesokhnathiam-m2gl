package com.mthiam.microcommerce.web.controller;

import com.mthiam.microcommerce.config.ResourceNotFoundException;
import com.mthiam.microcommerce.dao.ProductDao;
import com.mthiam.microcommerce.model.Product;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


/**
 * @author M.THIAM
 * @version 1.0.0
 */

@RestController
@Api(value="Ecommerce product controller")
public class ProductController {

    @Autowired
    private ProductDao productDao;

    @ApiOperation(value = "View a list of available employees", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    })

    @RequestMapping(value="/Produits", method=RequestMethod.GET)
    public List<Product> listeProduits() {
        return productDao.findAll();
    }

    @ApiOperation(value = "Get an product by Id")
    @GetMapping(value="/Produits/{id}")
    @ApiParam(value = "Product id from which product object will retrieve", required = true)
    public Product afficherUnProduit(@PathVariable int id) throws ResourceNotFoundException {
        return productDao.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: " + id));

    }
}
