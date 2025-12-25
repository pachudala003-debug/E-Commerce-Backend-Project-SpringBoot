package com.eswar.E_Commerce.Backend.API.service;

import java.util.List;

import com.eswar.E_Commerce.Backend.API.model.Product;

public interface ProductService {

	
	Product createProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
