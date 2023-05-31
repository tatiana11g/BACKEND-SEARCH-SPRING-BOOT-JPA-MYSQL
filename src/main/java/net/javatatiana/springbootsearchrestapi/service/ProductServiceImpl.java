package net.javatatiana.springbootsearchrestapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javatatiana.springbootsearchrestapi.entity.Product;
import net.javatatiana.springbootsearchrestapi.repository.ProductRepository;


@Service  // clase Service que  se  conecta con repositorios
public class ProductServiceImpl implements ProductService  {  // hereda de ProductService
	
	private ProductRepository productRepository;

   //generar constructor automatico  se usara inyeccion de dependencias basadas en constructor
   // constructor de la inyeccion de dependencia
	public ProductServiceImpl(ProductRepository productRepository) {
	this.productRepository = productRepository;
}

@Override
public List<Product> searchProducts(String query) {
    List<Product> products = productRepository.searchProducts(query);  //agregamos esto  llamar a productRepository y a su  metodo searchProducts
    return products;
}

@Override
public Product createProduct(Product product) {
    return productRepository.save(product);
}

}