package com.miniproject.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;

	@NotBlank(message = "FirstName cannot be null & blank")
	private String firstName;

	@NotBlank(message = "LastName cannot be null & blank")
	private String lastName;

	@Past(message = "Date must be in past.")
	private LocalDate birthDate;

	@Size(min = 10, max = 10, message = "Phone no length must be of 10 digits")
	private String phone;

	@Email(message = "Email should be in correct format.")
	private String email;

	@Size(min = 5, max = 8, message = "Password length must be in between min 5 and max 8")
	@NotBlank(message = "Password cannot be null or blank")
	private String password;

	@Valid
	@Embedded
	private Address adreses;

	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	private Cart cart;

	@JsonIgnore
	@OneToOne(cascade = CascadeType.ALL)
	private List<Orders> orders = new ArrayList<>();

}
