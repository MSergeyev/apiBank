package com.example.bankipi.dto;


import com.example.bankipi.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface Repo extends CrudRepository<Customers, Integer>, JpaRepository<Customers, Integer>{


    Optional<Customers> findById(int id);
}
