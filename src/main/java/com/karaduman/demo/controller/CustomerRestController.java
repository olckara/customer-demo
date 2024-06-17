package com.karaduman.demo.controller;

import com.karaduman.demo.customer.Customer;
import com.karaduman.demo.customer.CustomerService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Customer", description = "Customer management APIs")
@RestController
public class CustomerRestController {
  @Autowired
  private CustomerService customerService;

  @Operation(
      summary = "Retrieve a Customer by Id",
      description = "Get a Customer object by specifying its id. The response is Customer object with id, title, description and published status."
  )
  @ApiResponses({
      @ApiResponse(
          responseCode = "200",
          content = {@Content(schema = @Schema(implementation = Customer.class), mediaType = "application/json")}
      ),
      @ApiResponse(
          responseCode = "404",
          description = "Customer was not found."
      )
  })
  @GetMapping("/overview/{customerId}")
  public Customer getCustomerOverview(@PathVariable("customerId") Integer customerId) {
    return customerService.getCustomer(customerId);
  }

    @Operation(
        summary = "Register a new Customer",
        description = "Get a Customer object by specifying its id. The response is Customer object with id, title, description and published status."
    )
    @ApiResponses({
        @ApiResponse(
            responseCode = "200",
            content = {@Content(schema = @Schema(implementation = Customer.class), mediaType = "application/json")}
        ),
        @ApiResponse(
            responseCode = "400",
            description = "Customer already exists"
        )
    })
  @PostMapping("/register")
  public void registerCustomer(@RequestBody @Valid Customer customer) {
    customerService.registerCustomer(customer);
  }



  @Operation(
      summary = "Logon a Customer",
      description = "Logon a customer"
  )
  @ApiResponses({
      @ApiResponse(
          responseCode = "200",
          content = {@Content(schema = @Schema(implementation = Customer.class), mediaType = "application/json")}
      )
  })
  @PostMapping("/logon")
  public Boolean logon(@RequestParam Integer customerId, @RequestParam String password) {
    return customerService.logonCustomer(customerId, password);
  }

}
