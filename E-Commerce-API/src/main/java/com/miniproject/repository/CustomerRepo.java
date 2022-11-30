package com.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miniproject.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
