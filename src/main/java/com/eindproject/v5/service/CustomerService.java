package com.eindproject.v5.service;

import com.eindproject.v5.exception.RecordNotFoundException;
import com.eindproject.v5.model.Customer;
import com.eindproject.v5.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Iterable<Customer> findAll() {
        Iterable<Customer> customers = customerRepository.findAll();
        return customers;
    }

    public Iterable<Customer> findByLastName() {
//        Iterable<Customer> customers = customerRepository.findAll();
//        return customers;
        return null;
    }

    public Optional<Customer> findById(long id) {
        try {
            Optional<Customer> customer = customerRepository.findById(id);
            return customer;
        } catch(Exception ex) {
            throw new RecordNotFoundException("Customer does not exist");
        }
    }

    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteById(long id) {
        try {
            customerRepository.deleteById(id);
        } catch(Exception ex) {
            throw new RecordNotFoundException("Customer does not exist");
        }
    }
}
