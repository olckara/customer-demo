package com.karaduman.demo.iban;

import org.springframework.data.repository.Repository;

import java.util.Optional;

@org.springframework.stereotype.Repository
interface IbanRepository extends Repository<Iban, Integer> {

  Optional<Iban> findById(Integer customerId);

  void save(Iban entity);
}