package data.customer.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import data.customer.entity.Customer;

@Repository
public interface  CustomerRepository extends JpaRepository <Customer , Integer> {

}
