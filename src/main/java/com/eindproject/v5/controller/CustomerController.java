package com.eindproject.v5.controller;

import com.eindproject.v5.exception.RecordNotFoundException;
import com.eindproject.v5.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    private static List<Customer> customers = new ArrayList<>();

    @GetMapping("/customers")
    public ResponseEntity getCustomers(@RequestParam(required = false) String lastName) {
        if (lastName == null) {
            return ResponseEntity.ok(customers);
        } else {
            return ResponseEntity.ok(customers
                    .stream()
                    .filter(customer -> customer.lastName.equalsIgnoreCase(lastName))
                    .toArray());
        }
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity getCustomer(@PathVariable int id) {
        try {
            return ResponseEntity.ok(customers.get(id));
        } catch(Exception ex) {
            throw new RecordNotFoundException();
        }
    }

    @PostMapping("/customers")
    public ResponseEntity addCustomer(@RequestBody Customer customer) { //req body om info door te geven
        customers.add(customer);
        return ResponseEntity.ok("Customer added");
    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity deleteCustomer(@PathVariable int id) {
        customers.remove(customers.get(id)); //of alleen remove(id)?
        return ResponseEntity.ok("Customer deleted");
    }

    @PutMapping("/customers/{id}")
    public ResponseEntity updateCustomer(@PathVariable int id, @RequestBody Customer customer) {
        customers.set(id, customer);
        return ResponseEntity.ok("Customer updated");
    }
}
