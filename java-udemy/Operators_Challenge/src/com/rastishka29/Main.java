package com.rastishka29;

public class Main {

    public static void main(String[] args) {
        double first = 20.00d;
        double second = 80.00d;
        double third = (first + second)*100.00d;

        double fourth = third % 40.00d;
        boolean isZero = (fourth == 0) ? true : false;
        System.out.println(isZero);

        if(!isZero){
            System.out.println("Got some remainder");
        }
	// write your code here
    }
}
