package com.miniproject.model;

import javax.validation.constraints.NotBlank;

public class Address {

	@NotBlank(message = "City name cannot be null & blank")
	private String city;

	@NotBlank(message = "State name cannot be null & blank")
	private String state;

	@NotBlank(message = "Pincode cannot be null & blank")
	private String pincode;

	@NotBlank(message = "Country name cannot be null & blank")
	private String Country;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(@NotBlank(message = "City name cannot be null & blank") String city,
			@NotBlank(message = "State name cannot be null & blank") String state,
			@NotBlank(message = "Pincode cannot be null & blank") String pincode,
			@NotBlank(message = "Country name cannot be null & blank") String country) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.Country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		this.Country = country;
	}

}
