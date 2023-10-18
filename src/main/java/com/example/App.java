package com.example;

import com.betterexample.AnotherTestClass;
import com.betterexample.SpecialTestClass;
import com.betterexample.arrayClass;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello Brave New World!");

        TestClass testClass = new TestClass(66126);

        testClass.Display();
        testClass.x = 3345;
        testClass.Display();

        AnotherTestClass anotherClass = new AnotherTestClass(456);
        anotherClass.Display();

        SpecialTestClass specialClass = new SpecialTestClass(456, 88888);
        specialClass.DisplayTwo();
        specialClass.Display();

        SpecialTestClass newSpecialClass = specialClass;
        newSpecialClass.y = 1999;
        specialClass.DisplayTwo();
        newSpecialClass.DisplayTwo();

        arrayClass myArray = new arrayClass(28);
        myArray.Display();

    }

}
