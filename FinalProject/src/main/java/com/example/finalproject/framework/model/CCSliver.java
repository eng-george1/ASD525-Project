package com.example.finalproject.framework.model;

public class CCSliver extends CCAccountInterest{
    @Override
    double monthlyInterest() {
        return 8;
    }
    @Override
    double minimumPayment() {return 12;}
}
