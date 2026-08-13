package data.customer.service;


import data.customer.entity.*;
import java.util.List;
import org.springframework.stereotype.Service;
import data.customer.repository.CustomerRepository;

@Service
public class CustomerService {

	
	private CustomerRepository repository;
	
	public CustomerService (CustomerRepository repository) {
		this.repository = repository;
	}
	
	public List<Customer> getAllCustomers(){
		return repository.findAll();
	}
	
	public Customer getCustomerById(Integer id) {
		return repository.findById(id).orElse(null);
	}
	
	public Customer updateCustomer (Integer id , Customer updated) {
		return repository.findById(id).map(customer-> {
			customer.setName(updated.getName());
			customer.setAge(updated.getAge());
			customer.setAddress(updated.getAddress());
			customer.setPhoneNumber(updated.getPhoneNumber());
			customer.setEmail(updated.getEmail());
			return repository.save(customer);
		}).orElse(null);
	}
	
	public void deleteCustomer(Integer id) {
		repository.deleteById(id);
	}
}
