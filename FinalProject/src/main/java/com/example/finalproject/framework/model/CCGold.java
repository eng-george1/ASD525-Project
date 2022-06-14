package com.example.finalproject.framework.model;

public class CCGold extends CCAccountInterest{
    @Override
    double monthlyInterest() {
        return 6;
    }
    @Override
    double minimumPayment() {return 10;}
}
