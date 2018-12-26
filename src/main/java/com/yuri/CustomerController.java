package com.yuri;

import com.yuri.entity.Customer;

import org.springframework.stereotype.Controller;
import com.yuri.entity.repository.CustomerRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	private CustomerRepository repository;

	public  CustomerController(CustomerRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	@ResponseBody
	public List<Customer> findAll() {
		return (List<Customer>) repository.findAll();
	}

	@GetMapping("/{id}")
	@ResponseBody
	public Customer findOne(@PathVariable Long id) {
		return repository.findOne(id);
	}

	@GetMapping("/name/{name}")
	@ResponseBody
	public Customer findByName(@PathVariable String name) {
		return repository.findByName(name);
	}

	@PostMapping
	@ResponseBody
	public Customer create( @RequestParam String name, @RequestParam Integer age ) {
		Customer customer = new Customer(name, age);
		
		if ( name != null && name.length() > 0 && age != null && age > 0 ) {			
			repository.save(customer);
		}
		
		return customer;
	}
}
