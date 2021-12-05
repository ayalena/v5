package com.eindproject.v5.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    private static List<String> customers = new ArrayList<>();

    @GetMapping("/customers")
    public ResponseEntity getCustomers() {
        return ResponseEntity.ok(customers);
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity getCustomer(@PathVariable int id) {
        try {
            return ResponseEntity.ok(customers.get(id));
        } catch(Exception ex) {
            return ResponseEntity.badRequest().body("Customer doesn't exist");
        }
    }

    @PostMapping("/customers")
    public ResponseEntity addCustomer(@RequestBody String customer) { //req body om info door te geven
        customers.add(customer);
        return ResponseEntity.ok("Customer added");
    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity deleteCustomer(@PathVariable int id) {
        customers.remove(customers.get(id)); //of alleen remove(id)?
        return ResponseEntity.ok("Customer deleted");
    }

    @PutMapping("/customers/{id}")
    public ResponseEntity updateCustomer(@PathVariable int id, @RequestBody String customer) {
        customers.set(id, customer);
        return ResponseEntity.ok("Customer updated");
    }
}
