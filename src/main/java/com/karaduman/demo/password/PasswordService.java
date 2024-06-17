package com.karaduman.demo.password;

import com.karaduman.demo.util.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {
  @Autowired
  private PasswordRepository passwordRepository;

  public void createPassword(Integer customerId) {
    String password = PasswordUtils.generatePassword(12);
    passwordRepository.save(new Password(customerId, password));
  }

  public Boolean validatePassword(Integer customerId, String password) {
    return passwordRepository
        .findById(customerId)
        .map(value -> value.getPassword().equals(password))
        .orElse(false);
  }
}
