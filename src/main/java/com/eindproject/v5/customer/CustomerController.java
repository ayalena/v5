//package com.eindproject.v5.controller;
//
//import com.eindproject.v5.model.Customer;
//import com.eindproject.v5.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import java.net.URI;
//
//@RestController
//public class CustomerController {
//
//    private final CustomerService customerService;
//
//    @Autowired
//    public CustomerController(CustomerService customerService) {
//        this.customerService = customerService;
//    }
//
//
//    //GET
//    @GetMapping("/customers")
//    public ResponseEntity getCustomers() {
//        return ResponseEntity.ok().body(customerService.getCustomers());
//    }
//
//    @GetMapping("/customers/{id}")
//    public ResponseEntity getCustomerById(@PathVariable long id) {
//        return ResponseEntity.ok().body(customerService.getCustomerById(id));
//    }
//
//
//
//    //POST
//    @PostMapping("/customers")
//    public ResponseEntity addCustomer(@RequestBody Customer customer) {
//        long newId = customerService.addCustomer(customer);
//
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//                .buildAndExpand(newId).toUri();
//
//        return ResponseEntity.created(location).body(location);
//    }
//
//
//    //PUT
//    @PutMapping("/customers/{id}")
//    public ResponseEntity updateCustomer(@PathVariable long id, @RequestBody Customer customer) {
//        customerService.updateCustomer(id, customer);
//        return ResponseEntity.ok("Customer updated");
//    }
//
//
//    //DELETE
//    @DeleteMapping("/customers/{id}")
//    public ResponseEntity deleteCustomer(@PathVariable long id) {
//        customerService.deleteCustomerById(id);
//        return ResponseEntity.ok("Customer deleted");
//    }
//
//
//}
