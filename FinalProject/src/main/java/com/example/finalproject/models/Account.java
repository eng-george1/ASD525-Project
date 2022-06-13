package com.demo.framework.models;

import java.util.ArrayList;
import java.util.List;

public class Account {
    //That will be in account service
//    abstract void depositMoney();
//    abstract void withdrawMoney();

    private String id;
    private Customer customer;
    private AccountType accountType;
    private List<AccountEntry> listOfAccountEntries;
    private Double balance;
    private AccountInterest accountInterest;

    public Account(String id, Customer customer, Double balance, AccountType accountType,AccountInterest accountInterest) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
        this.accountType = accountType;
        this.accountInterest = accountInterest;
    }

    public void addAccountEntry(AccountEntry accountEntry) {
        if (null == accountEntry) {
            listOfAccountEntries = new ArrayList<>();
        }
        this.listOfAccountEntries.add(accountEntry);
    }

    public String getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public List<AccountEntry> getListOfAccountEntries() {
        return listOfAccountEntries;
    }

    public double depositMoney(Double moneyAdded){
        balance += moneyAdded;
        return balance;
    }

    public double withdrawMoney(Double withdrawMoney){
        if(withdrawMoney > balance) {
            return -1;
        }
        return balance - withdrawMoney;
    }

    public void getReports(){
        System.out.println();
    }

    public Double getBalance() {
        // return listOfAccountEntries.stream().mapToDouble(e -> e.getAmount()).sum();
        return balance;
    }

    public void addInterest(){
        //TODO some operations
        accountInterest.calculateInterest(balance);
    }
}
