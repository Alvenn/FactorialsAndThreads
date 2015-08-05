package com.gmail.alvenn89;

import java.math.BigInteger;

public class FactorialThread implements Runnable{
    int number;

    public FactorialThread(int number) {
        this.number = number;
    }

    public BigInteger factorial(){
        BigInteger res = BigInteger.valueOf(1);
        for (int i = 1; i <= number + 1 ; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

    @Override
    public void run() {
        System.out.println("I am thread number " + (number+1) + " my factorial is " + factorial());
    }
}
