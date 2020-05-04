package com.yuliiak;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(isEvenNumber(5));
//        System.out.println(isEvenNumber(6));

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            evenNumbersFound ++;
            System.out.println("Even number " + number);

            if(evenNumbersFound >= 5 ){
                break;
            }
        }
        System.out.println("Total evenNumbersFound of even numbers is " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number){
        if(number%2 == 0){
            return true;
        }
        return false;
    }
}
