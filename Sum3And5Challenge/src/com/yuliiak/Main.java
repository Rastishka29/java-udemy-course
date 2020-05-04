package com.yuliiak;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        int count = 0;
        for(int i=1; i<=1000; i++){
            if(count == 5){
                break;

            }
            if(i%3==0 && i%5==0){
                sum = sum + i;
                System.out.println("Can be divided by 3 and 5 - " + i);
                count++;
            }
        }
        System.out.println("Sum of all numbers is " + sum);
    }
}
