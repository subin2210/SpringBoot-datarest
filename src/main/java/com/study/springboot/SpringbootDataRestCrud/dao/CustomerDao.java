package com.study.springboot.SpringbootDataRestCrud.dao;

import com.study.springboot.SpringbootDataRestCrud.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
}
