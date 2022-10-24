package com.example.practice_springjpa_store_proceduce.service;

import com.example.practice_springjpa_store_proceduce.model.Customer;
import com.example.practice_springjpa_store_proceduce.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public boolean insertWithStoredProcedure(Customer customer) {
        return customerRepository.insertWithStoredProcedure(customer);
    }
}
