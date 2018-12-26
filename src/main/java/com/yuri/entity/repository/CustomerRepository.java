package com.yuri.entity.repository;

import com.yuri.entity.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
}
