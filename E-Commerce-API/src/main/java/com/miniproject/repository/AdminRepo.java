package com.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miniproject.model.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
