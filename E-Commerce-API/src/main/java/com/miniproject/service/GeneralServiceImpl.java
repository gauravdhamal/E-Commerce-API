package com.miniproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.miniproject.exception.RecordNotFound;
import com.miniproject.model.Category;
import com.miniproject.model.Product;
import com.miniproject.repository.CategoryRepo;
import com.miniproject.repository.ProductRepo;

public class GeneralServiceImpl implements GeneralService {

	@Autowired
	private ProductRepo productRepo;

	@Autowired
	private CategoryRepo categoryRepo;

	@Override
	public List<Product> getAllProducts() throws RecordNotFound {

		List<Product> products = productRepo.findAll();

		return products;

	}

	@Override
	public Product gerProductById(Integer productId) throws RecordNotFound {

		Optional<Product> optProduct = productRepo.findById(productId);

		if (optProduct.isPresent()) {
			return optProduct.get();
		} else {
			throw new RecordNotFound("No any record found with id : " + productId);
		}

	}

	@Override
	public List<Product> getProductsByCategory(Integer categoryId) throws RecordNotFound {

		Optional<Category> optCategory = categoryRepo.findById(categoryId);

		if (optCategory.isPresent()) {

			return optCategory.get().getProducts();

		} else {
			throw new RecordNotFound("No any record found with category ID : " + categoryId);
		}

	}

	@Override
	public List<Product> sortProductsByPriceAsc() throws RecordNotFound {

		List<Product> products = productRepo.sortProductsByPriceAsc();

		return products;
	}

	@Override
	public List<Product> sortProductsByPriceDesc() throws RecordNotFound {

		List<Product> products = productRepo.sortProductsByPriceDesc();

		return products;
	}

	@Override
	public List<Product> sortProductsByRatingAsc() throws RecordNotFound {

		List<Product> products = productRepo.sortProductsByRatingAsc();

		return products;
	}

	@Override
	public List<Product> sortProductsByRatingDesc() throws RecordNotFound {

		List<Product> products = productRepo.sortProductsByRatingDesc();

		return products;
	}

	@Override
	public List<Product> filterProductsByPrice(Integer from, Integer to) throws RecordNotFound {

		List<Product> products = productRepo.filterProductsByPrice(from, to);

		return products;
	}

	@Override
	public List<Product> filterProductsByRating(Double from, Double to) throws RecordNotFound {

		List<Product> products = productRepo.filterProductsByRating(from, to);

		return products;
	}

}
