package com.demo.framework.models;

public class Company extends Account {
    public Company(String id, Customer customer, Double balance, AccountType accountType, AccountInterest accountInterest) {
        super(id, customer, balance, accountType, accountInterest);
    }
}
