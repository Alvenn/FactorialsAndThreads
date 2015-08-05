package com.gmail.alvenn89;

public class Main {
    public static void main(String[] args) {
        Thread[] array = new Thread[100];

        for (int i = 0; i < 100 ; i++) {
            array[i] = new Thread(new FactorialThread(i));
            array[i].start();

        }
    }
}
