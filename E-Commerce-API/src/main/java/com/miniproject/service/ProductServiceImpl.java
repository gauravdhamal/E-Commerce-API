package com.miniproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.exception.ProductException;
import com.miniproject.model.Product;
import com.miniproject.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;

	@Override
	public List<Product> searchProducts(String name) throws ProductException {
//		List<Product> products = new ArrayList<>();
//
//		products = productRepo.searchProducts(name);
//
//		return products;
		
		return null;
	}

	@Override
	public Product getProductByName(String name) throws ProductException {
//		Product product = new Product();
//
//		product = productRepo.getProductByName(name);
//
//		return product;

		return null;
	}

}
