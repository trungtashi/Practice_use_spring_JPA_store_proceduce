package com.example.practice_springjpa_store_proceduce.service;

import com.example.practice_springjpa_store_proceduce.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}
