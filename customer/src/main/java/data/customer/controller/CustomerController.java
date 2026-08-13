package data.customer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import data.customer.entity.Customer;
import data.customer.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	private final CustomerService service;
	
	public CustomerController (CustomerService service) {
		this.service = service;
	}

	@GetMapping
	public List<Customer> getAllCustomers(){
		return service.getAllCustomers();
	}
	
	@GetMapping("/{id}")
	public Customer getCustomer(@PathVariable Integer id) {
		return service.getCustomerById(id);
	}
	
	@PutMapping("/{id}")
	public Customer updateCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
	
		return service.updateCustomer(id, customer);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCustomer(@PathVariable Integer id) {
		service.deleteCustomer(id);
	}
	
	
	
}
