package com.miniproject.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;

	@NotBlank(message = "Product name cannot be null and blank")
	private String productName;

	@NotBlank(message = "Product description cannot be null and blank")
	private String productDescription;

	@NotBlank(message = "Product brand name cannot be null and blank")
	private String productBrand;

	@NotBlank(message = "Product rating cannot be null and blank")
	private double rating;

	@Min(value = 0, message = "Product SalePrice cannot be less than 0")
	private Integer productSalePrice;

	@Min(value = 0, message = "Product MarketPrice cannot be less than 0")
	private Integer productMarketPrice;

	private Integer stock;

	@ManyToOne(cascade = CascadeType.ALL)
	private Category category;

	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	private OrderDetails orderDetails;

	public Product() {
		super();
	}

	public Product(Integer productId, @NotBlank(message = "Product name cannot be null and blank") String productName,
			@NotBlank(message = "Product description cannot be null and blank") String productDescription,
			@NotBlank(message = "Product brand name cannot be null and blank") String productBrand,
			@NotBlank(message = "Product rating cannot be null and blank") double rating,
			@Min(value = 0, message = "Product SalePrice cannot be less than 0") Integer productSalePrice,
			@Min(value = 0, message = "Product MarketPrice cannot be less than 0") Integer productMarketPrice,
			Integer stock, Category category, OrderDetails orderDetails) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productBrand = productBrand;
		this.rating = rating;
		this.productSalePrice = productSalePrice;
		this.productMarketPrice = productMarketPrice;
		this.stock = stock;
		this.category = category;
		this.orderDetails = orderDetails;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Integer getProductSalePrice() {
		return productSalePrice;
	}

	public void setProductSalePrice(Integer productSalePrice) {
		this.productSalePrice = productSalePrice;
	}

	public Integer getProductMarketPrice() {
		return productMarketPrice;
	}

	public void setProductMarketPrice(Integer productMarketPrice) {
		this.productMarketPrice = productMarketPrice;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}

}
