package com.karaduman.demo.controller;

import com.karaduman.demo.customer.Customer;
import com.karaduman.demo.customer.CustomerService;
import com.karaduman.demo.model.CustomerOverview;
import com.karaduman.demo.service.CustomerOverviewService;
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
  @Autowired
  private CustomerOverviewService customerOverviewService;

  @Operation(
      summary = "Get a Customer Overview by Id"
  )
  @ApiResponses({
      @ApiResponse(
          responseCode = "200",
          content = {@Content(schema = @Schema(implementation = CustomerOverview.class), mediaType = "application/json")}
      ),
      @ApiResponse(
          responseCode = "404",
          description = "Customer was not found."
      )
  })
  @GetMapping("/overview/{customerId}")
  public CustomerOverview getCustomerOverview(@PathVariable("customerId") Integer customerId) {
    return customerOverviewService.getCustomerOverview(customerId);
  }

    @Operation(
        summary = "Register a new Customer"
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
      summary = "Logon a Customer"
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
