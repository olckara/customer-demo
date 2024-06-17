package com.karaduman.demo.iban;

import com.karaduman.demo.util.IbanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IbanService {
  @Autowired
  private IbanRepository ibanRepository;

  public void createIban(Integer customerId) {
    String iban = IbanUtils.generateIban("NL", "ABNA");
    ibanRepository.save(new Iban(iban, customerId));
  }

  public Iban getIban(Integer customerId) {
    return ibanRepository
        .findById(customerId)
        .orElse(null);
  }
}
