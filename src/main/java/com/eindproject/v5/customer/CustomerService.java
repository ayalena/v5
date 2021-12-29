//package com.eindproject.v5.service;
//
//import com.eindproject.v5.exception.RecordNotFoundException;
//import com.eindproject.v5.model.Customer;
//import com.eindproject.v5.repository.CustomerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Collection;
//import java.util.Optional;
//
//@Service
//public class CustomerService {
//
//    private final CustomerRepository customerRepository;
//
//    @Autowired
//    public CustomerService(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }
//
//
//    //methods GET
//    public Collection<Customer> getCustomers() {
//        return customerRepository.findAll();
//    }
//
//    public Optional<Customer> getCustomerById(long id) {
//        try {
//            Optional<Customer> customer = customerRepository.findById(id);
//            return customer;
//        } catch(Exception ex) {
//            throw new RecordNotFoundException("Customer does not exist");
//        }
//    }
//
//    //methods POST
//    public long addCustomer(Customer customer) {
//        Customer newCustomer = customerRepository.save(customer);
//        return newCustomer.getId();
//    }
//
//
//    //methods PUT
//    public void updateCustomer(long id, Customer customer) {
//        try {
//            Customer existingCustomer = customerRepository.findById(id).get();
//            existingCustomer.setFirstName(customer.getFirstName());
//            existingCustomer.setLastName(customer.getLastName());
//            existingCustomer.setResidency(customer.getResidency());
//            customerRepository.save(existingCustomer);
//        } catch(Exception ex) {
//            throw new RecordNotFoundException("Customer does not exist");
//        }
//    }
//
//
//    //methods DELETE
//    public void deleteCustomerById(long id) {
//        try {
//            customerRepository.deleteById(id);
//        } catch(Exception ex) {
//            throw new RecordNotFoundException("Customer does not exist");
//        }
//    }
//
//
//}
