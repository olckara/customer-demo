package com.karaduman.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Collection;
import java.util.Date;

@Data
@AllArgsConstructor
public class CustomerOverview {

  @NotBlank
  private String name;

  @NotBlank
  private String address;

  @Past(message = "Date of birth must be less than today")
  private Date dateOfBirth;

  @NotBlank
  private String idDocument;

  private Collection<String> ibans;

}
