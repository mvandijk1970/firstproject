package com.betterexample;

public class AnotherTestClass   {
    protected int x=0;

    public AnotherTestClass()
    {}

    public AnotherTestClass(int i)
    {
        x = i;
    }

    public void Display()
    {
        System.out.println(this.toString());
        System.out.println(x);
    }
}
