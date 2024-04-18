package com.superOOP.abstract_;

public class BB extends Template{
    public void job() {
        long num = 1;
        for (long i = 0; i < 100000; i++) {
            num *= i;
        }
    }
}
