package net.javatatiana.springbootsearchrestapi.service;

import java.util.List;

import net.javatatiana.springbootsearchrestapi.entity.Product;

public interface ProductService {
	
	//llamado
	
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
