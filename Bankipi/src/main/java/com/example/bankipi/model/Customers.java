package com.example.bankipi.model;

import lombok.Data;


import javax.persistence.*;


@Entity
@Data
@Table(name = "customers")
public class Customers  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int balance;


    public Customers() {
    }

    public Customers(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }




}
