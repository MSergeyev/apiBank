package com.example.bankipi.service;

import com.example.bankipi.dto.Repo;
import com.example.bankipi.model.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BankService {

    @Autowired
    private Repo repo;


    public int getBalance(int id) {
        Customers customers = repo.getById(id);
        return customers.getBalance();

    }

    public void createacc(Customers customers) {
        repo.save(customers);

    }

}
