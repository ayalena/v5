package com.eindproject.v5.controller;

import com.eindproject.v5.exception.RecordNotFoundException;
import com.eindproject.v5.model.Customer;
import com.eindproject.v5.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    private Iterable<Customer> customers;

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/customers")
    public ResponseEntity getCustomers(@RequestParam(required = false) String lastName) {

            customers = customerRepository.findAll();
            return ResponseEntity.ok(customers);
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity getCustomer(@PathVariable long id) {
        try {
            Optional<Customer> customer = customerRepository.findById(id);
            return ResponseEntity.ok(customer);
        } catch(Exception ex) {
            throw new RecordNotFoundException();
        }
    }

    @PostMapping("/customers")
    public ResponseEntity addCustomer(@RequestBody Customer customer) { //req body om info door te geven
        customerRepository.save(customer);
        return ResponseEntity.ok("Customer added");
    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity deleteCustomer(@PathVariable long id) {
        customerRepository.deleteById(id);
        return ResponseEntity.ok("Customer deleted");
    }

    @PutMapping("/customers/{id}")
    public ResponseEntity updateCustomer(@PathVariable long id, @RequestBody Customer customer) {

        return ResponseEntity.ok("Customer updated");
    }
}
