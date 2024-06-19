package com.karaduman.demo.service;

import com.karaduman.demo.customer.Customer;
import com.karaduman.demo.customer.CustomerService;
import com.karaduman.demo.iban.IbanService;
import com.karaduman.demo.model.CustomerOverview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOverviewService {
  @Autowired
  private CustomerService customerService;
  @Autowired
  private IbanService ibanService;

  public CustomerOverview getCustomerOverview(Integer customerId) {
    Customer customer = customerService.getCustomer(customerId);
    List<String> ibans = ibanService.getIbans(customerId);

    return new CustomerOverview(
        customer.getName(),
        customer.getAddress(),
        customer.getDateOfBirth(),
        customer.getIdDocument(),
        ibans
    );

  }
}
