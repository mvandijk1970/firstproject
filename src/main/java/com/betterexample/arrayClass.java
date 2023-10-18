package com.betterexample;

public class arrayClass {
    int test[];

    public arrayClass(int i) {
        test = new int[i];
        for (int j = 0; j < i; j++) {
            test[j] = j;

        }

    }

    public void Display() {
        for (int i : test) {
            System.out.println(i);
        }
    }
}
