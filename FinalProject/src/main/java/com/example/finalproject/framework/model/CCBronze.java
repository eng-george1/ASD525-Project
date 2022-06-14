package com.example.finalproject.framework.model;

public class CCBronze extends CCAccountInterest{
    @Override
    double monthlyInterest() {
        return 10;
    }

    @Override
    double minimumPayment() {return 14;}

}
