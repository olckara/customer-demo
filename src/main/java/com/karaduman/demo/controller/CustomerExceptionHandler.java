package com.karaduman.demo.controller;

import com.karaduman.demo.exception.CustomerNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.relational.core.conversion.DbActionExecutionException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;

@RestControllerAdvice
public class CustomerExceptionHandler {

  @ExceptionHandler(CustomerNotFoundException.class)
  public ProblemDetail handleCustomerNotFoundException(CustomerNotFoundException ex) {
    return ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, "Customer not found");
  }

  @ExceptionHandler({DbActionExecutionException.class})
  public ProblemDetail handleDbActionExecutionException(DataIntegrityViolationException ex) {
    if (ex.getCause() instanceof SQLIntegrityConstraintViolationException) {
      return ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, "Customer already exists");
    } else throw ex;
  }

  // Fallback handler for any unhandled exceptions
  @ExceptionHandler(Exception.class)
  public ProblemDetail handleGenericException(Exception ex) {
    return ProblemDetail.forStatusAndDetail(HttpStatus.INTERNAL_SERVER_ERROR, "An error occurred");
  }
}
