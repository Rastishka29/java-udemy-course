package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Min Float Value is " + myMinFloatValue);
        System.out.println("Max Float Value is " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min Double Value is " + myMinDoubleValue);
        System.out.println("Max Double Value is " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        // double myDoubleValue = 5.00 / 3.00; --- the same result, Java automatically treats decimal numbers
        // as a double value

        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        // Challenge

        double pounds = 200d;
        double kilos = pounds * 0.45359237d;
        System.out.println("Kilograms = " + kilos);

        double pi = 3.1415927d;
        double anotherDoubleNumber = 3_000_000.4_567_890d;

        System.out.println(pi);
        System.out.println(anotherDoubleNumber);

    }
}
