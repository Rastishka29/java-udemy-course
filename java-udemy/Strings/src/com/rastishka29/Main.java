package com.rastishka29;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        String myString = "This is a String";
        System.out.println("My String is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My String is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("My String is equal to " + myString);
        String numberString = "250.45";
        numberString = numberString + "45.89";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        double myDoubleValue = 120.47d;
        lastString = lastString + myDoubleValue;
        System.out.println(lastString);


    }
}
