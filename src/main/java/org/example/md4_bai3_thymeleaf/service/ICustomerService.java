package org.example.md4_bai3_thymeleaf.service;

import org.example.md4_bai3_thymeleaf.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
