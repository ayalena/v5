package com.eindproject.v5.repository;

import com.eindproject.v5.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    //customised methodes kunnen hier, bv findByLastName();

}
