package com.miniproject.service;

import java.util.List;

import com.miniproject.exception.RecordNotFound;
import com.miniproject.model.Product;

public interface GeneralService {

	// Method to get all products
	public List<Product> getAllProducts() throws RecordNotFound;

	// Method to get single product
	public Product gerProductById(Integer productId) throws RecordNotFound;

	// Method for getting products by category
	public List<Product> getProductsByCategory(Integer categoryId) throws RecordNotFound;

	// Method for sorting products by price ascending
	public List<Product> sortProductsByPriceAsc() throws RecordNotFound;

	// Method for sorting products by price descending
	public List<Product> sortProductsByPriceDesc() throws RecordNotFound;

	// Method for sorting products by rating ascending
	public List<Product> sortProductsByRatingAsc() throws RecordNotFound;

	// Method for sorting products by rating descending
	public List<Product> sortProductsByRatingDesc() throws RecordNotFound;

	// Method for filter products by price
	public List<Product> filterProductsByPrice(Integer from, Integer to) throws RecordNotFound;

	// Method for filter products by rating
	public List<Product> filterProductsByRating(Double from, Double to) throws RecordNotFound;

}
