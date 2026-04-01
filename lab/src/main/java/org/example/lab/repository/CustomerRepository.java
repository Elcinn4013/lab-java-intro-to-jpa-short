package org.example.lab.repository;

import org.example.lab.entity.Customer;
import org.example.lab.entity.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    public List<Customer> findByCustomerStatus(CustomerStatus status);
}
