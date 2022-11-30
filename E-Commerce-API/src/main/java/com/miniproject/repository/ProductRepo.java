package com.miniproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.miniproject.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

//	@Query("SELECT FROM Product WHERE productDescription LIKE '%?1%'")
//	public List<Product> searchProducts(String name);
//
//	@Query("SELECT FROM Product WHERE productName LIKE '%?1%'")
//	public Product getProductByName(String name);

	@Query("SELECT FROM Product ORDER BY productSalePrice ASC")
	public List<Product> sortProductsByPriceAsc();

	@Query("SELECT FROM Product ORDER BY productSalePrice DESC")
	public List<Product> sortProductsByPriceDesc();

	@Query("SELECT FROM Product ORDER BY rating ASC")
	public List<Product> sortProductsByRatingAsc();

	@Query("SELECT FROM Product ORDER BY rating DESC")
	public List<Product> sortProductsByRatingDesc();

	@Query("SELECT FROM Product WHERE productSalePrice >= ?1 AND productSalePrice <= ?2")
	public List<Product> filterProductsByPrice(Integer from, Integer to);

	@Query("SELECT FROM Product WHERE rating >= ?1 AND rating <= ?2")
	public List<Product> filterProductsByRating(Double from, Double to);
}
