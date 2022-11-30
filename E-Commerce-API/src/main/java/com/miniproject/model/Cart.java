package com.miniproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cartId;

	private Integer cartTotal;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(Integer cartId, Integer cartTotal) {
		super();
		this.cartId = cartId;
		this.cartTotal = cartTotal;
	}

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public Integer getCartTotal() {
		return cartTotal;
	}

	public void setCartTotal(Integer cartTotal) {
		this.cartTotal = cartTotal;
	}

}
