package com.karaduman.demo.customer;

import org.springframework.data.repository.Repository;

import java.util.Optional;

@org.springframework.stereotype.Repository
interface CustomerRepository extends Repository<Customer, Integer> {

  Optional<Customer> findById(Integer id);

  Customer save(Customer entity);
}
