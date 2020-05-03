package com.rastishka29;

public class Main {

    public static void main(String[] args) {
//        int switchValue = 3;
//
//        switch (switchValue){
//            case 1:
//                System.out.println("Value was 1");
//                break;
//
//            case 2:
//                System.out.println("Value was 2");
//                break;
//
//            case 3: case 4: case 5:
//                System.out.println("Was a 3, or a 4, or a 5");
//                System.out.println("Actually, it was a " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1 or 2");
//                break;
//        }


//      Switch statement with Char type


//        char charValue = 'C';
//
//        switch (charValue){
//            case 'A':
//                System.out.println("This is an A");
//                break;
//
//            case 'B':
//                System.out.println("This is a B");
//                break;
//
//            case 'C': case 'D': case 'E':
//                System.out.println(charValue + " was found");
//                break;
//
//            default:
//                System.out.println("Not found A, B, C, D, E");
//                break;
//
//        }


//        Switch statement with String type


        String month = "January";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
        }

    }
}
