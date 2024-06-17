package com.karaduman.demo.customer;

import com.karaduman.demo.exception.CustomerNotFoundException;
import com.karaduman.demo.iban.IbanService;
import com.karaduman.demo.password.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
  @Autowired
  private CustomerRepository customerRepository;
  @Autowired
  private PasswordService passwordService;
  @Autowired
  private IbanService ibanService;

  public Customer getCustomer(Integer customerId) {
    return customerRepository
        .findById(customerId)
        .orElseThrow(CustomerNotFoundException::new);
  }

  public void registerCustomer(Customer customer) {
    Customer savedCustomer = customerRepository.save(customer);
    passwordService.createPassword(savedCustomer.getCustomerId());
    ibanService.createIban(savedCustomer.getCustomerId());
  }

  public Boolean logonCustomer(Integer customerId, String password) {
    Customer customer = customerRepository.findById(customerId)
        .orElseThrow(CustomerNotFoundException::new);
    return passwordService.validatePassword(customerId, password);
  }
}
