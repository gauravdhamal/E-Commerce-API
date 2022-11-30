package com.miniproject.service;

import java.util.List;

import com.miniproject.exception.CustomerException;
import com.miniproject.exception.OrderException;
import com.miniproject.exception.ProductException;
import com.miniproject.model.Customer;
import com.miniproject.model.Orders;
import com.miniproject.model.Product;

public interface AdminService {

	// Product related methods
	public Product addNewProduct(Product product);

	public Product updateProduct(Product product) throws ProductException;

	public Product deleteProductById(Integer productId) throws ProductException;

	// Order related methods
	public Orders getOrderById(Integer orderId) throws OrderException;

	public Orders updateOrder(Orders order) throws OrderException;

	// User related methods
	public Customer getCustomerById(Integer customerId) throws CustomerException;

	public Customer getCustomerByEmail(String email) throws CustomerException;

	public List<Customer> getAllCustomers() throws CustomerException;

}
