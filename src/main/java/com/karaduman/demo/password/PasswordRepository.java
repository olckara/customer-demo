package com.karaduman.demo.password;

import org.springframework.data.repository.Repository;

import java.util.Optional;

@org.springframework.stereotype.Repository
interface PasswordRepository extends Repository<Password, Integer> {

  Optional<Password> findById(Integer customerId);

  void save(Password entity);
}