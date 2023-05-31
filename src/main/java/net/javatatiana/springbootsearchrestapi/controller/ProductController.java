package net.javatatiana.springbootsearchrestapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.javatatiana.springbootsearchrestapi.entity.Product;
import net.javatatiana.springbootsearchrestapi.service.ProductService;

@RestController  //indica clase controller
@RequestMapping("/api/v1/products")
public class ProductController {

	private ProductService productService;

	
	//constructor de la dependencia
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	
	
	@GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){ 
        return ResponseEntity.ok(productService.searchProducts(query)); //llamado a la interfaz
    }

	 @PostMapping
	    public Product createProduct(@RequestBody Product product){
	        return productService.createProduct(product); //llamado a la interfaz
	    }
   
}
