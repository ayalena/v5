package com.eindproject.v5.controller;

import com.eindproject.v5.model.Customer;
import com.eindproject.v5.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CustomerController {

    private Iterable<Customer> customers;

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public ResponseEntity getCustomers(@RequestParam(required = false) String lastName) {
        customers = customerService.findAll();
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity getCustomer(@PathVariable long id) {

        Optional<Customer> customer = customerService.findById(id);
        return ResponseEntity.ok(customer);

    }

    @PostMapping("/customers")
    public ResponseEntity addCustomer(@RequestBody Customer customer) { //req body om info door te geven
        customerService.save(customer);
        return ResponseEntity.ok("Customer added");
    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity deleteCustomer(@PathVariable long id) {
        customerService.deleteById(id);
        return ResponseEntity.ok("Customer deleted");
    }

    @PutMapping("/customers/{id}")
    public ResponseEntity updateCustomer(@PathVariable long id, @RequestBody Customer customer) {

        return ResponseEntity.ok("Customer updated");
    }
}
