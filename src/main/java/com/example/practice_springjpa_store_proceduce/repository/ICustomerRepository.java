package com.example.practice_springjpa_store_proceduce.repository;
import com.example.practice_springjpa_store_proceduce.model.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}