package com.karaduman.demo.customer;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.AccessType;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@AccessType(AccessType.Type.PROPERTY)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Schema(description = "Customer name, address, username etc.")
public class Customer {
  @Id
  @Schema(accessMode = Schema.AccessMode.READ_ONLY)
  private Integer customerId;

  @NotBlank
  private String name;

  @NotBlank
  private String address;

  @Past(message="Date of birth must be less than today")
  private Date dateOfBirth;

  private String idDocument;

  @NotNull(message = "Username can not be null")
  private String username;
}
