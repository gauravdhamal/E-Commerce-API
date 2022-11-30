package com.miniproject.service;

import java.util.List;

import com.miniproject.exception.ProductException;
import com.miniproject.model.Product;

public interface ProductService {

	public List<Product> searchProducts(String name) throws ProductException;

	public Product getProductByName(String name) throws ProductException;

}
