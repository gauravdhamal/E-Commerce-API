package com.miniproject.model;

import java.time.LocalDate;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer adminId;

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

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Integer adminId, @NotBlank(message = "FirstName cannot be null & blank") String firstName,
			@NotBlank(message = "LastName cannot be null & blank") String lastName,
			@Past(message = "Date must be in past.") LocalDate birthDate,
			@Size(min = 10, max = 10, message = "Phone no length must be of 10 digits") String phone,
			@Email(message = "Email should be in correct format.") String email,
			@Size(min = 5, max = 8, message = "Password length must be in between min 5 and max 8") @NotBlank(message = "Password cannot be null or blank") String password,
			@Valid Address adreses) {
		super();
		this.adminId = adminId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.adreses = adreses;
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAdreses() {
		return adreses;
	}

	public void setAdreses(Address adreses) {
		this.adreses = adreses;
	}

}
