package com.demo.framework.models;

public class Personal extends Account{

    public Personal(String id, Customer customer, Double balance, AccountType accountType, AccountInterest accountInterest) {
        super(id, customer, balance, accountType, accountInterest);
    }
}
