package net.javatatiana.springbootsearchrestapi.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.javatatiana.springbootsearchrestapi.entity.Product;



public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
            "Or p.description LIKE CONCAT('%', :query, '%')")
    List<Product> searchProducts(String query);

}


	 /**
	 //SQL nativo 
	 @Query(value ="SELECT * FROM products p WHERE " +  //seria nombre de la tabla  y se agrega value
	            "p.name LIKE CONCAT('%',:query, '%')" + // no usamos alias sino *
	            "Or p.description LIKE CONCAT('%', :query, '%')", nativeQuery = true) // pasar la consulta nativa a true 
	List<Product> searchProductsSQL(String query); 
	 
	**/ 
	 
