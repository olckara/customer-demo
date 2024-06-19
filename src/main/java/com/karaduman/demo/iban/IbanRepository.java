package com.karaduman.demo.iban;

import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
interface IbanRepository extends Repository<Iban, String> {

  List<Iban> findByCustomerId(Integer customerId);

  void save(Iban entity);
}