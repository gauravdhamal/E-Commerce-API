package com.miniproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Payments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer paymentId;

	private String paymentType;

	@NotBlank(message = "allowed cannot be null or blank. (Enter either true or false)")
	private Boolean allowed;

	public Payments() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payments(Integer paymentId, String paymentType,
			@NotBlank(message = "allowed cannot be null or blank. (Enter either true or false)") Boolean allowed) {
		super();
		this.paymentId = paymentId;
		this.paymentType = paymentType;
		this.allowed = allowed;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Boolean getAllowed() {
		return allowed;
	}

	public void setAllowed(Boolean allowed) {
		this.allowed = allowed;
	}

}
