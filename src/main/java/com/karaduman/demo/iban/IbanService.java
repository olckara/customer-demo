package com.karaduman.demo.iban;

import com.karaduman.demo.util.IbanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class IbanService {
  @Autowired
  private IbanRepository ibanRepository;

  public void createIban(Integer customerId) {
    String iban = IbanUtils.generateIban("NL", "ABNA");
    ibanRepository.save(new Iban(iban, customerId));
  }

  public List<String> getIbans(Integer customerId) {
    return ibanRepository
        .findByCustomerId(customerId).stream()
        .map(Iban::getIban)
        .collect(Collectors.toList());
  }
}
