package com.betterexample;
// hallo dit is leuk
public class SpecialTestClass extends AnotherTestClass {
    public int y = 0;

    public SpecialTestClass() {
    }

    public SpecialTestClass(int i, int j) {
        x = i;
        y = j;
    }

    public void DisplayTwo() {
        System.out.println(this.toString());
        System.out.println(x);
        System.out.println(y);
    }
}
