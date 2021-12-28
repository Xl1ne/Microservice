package com.myapp.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
