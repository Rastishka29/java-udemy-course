package com.yuliiak;

public class LoopsChallenges {

    // Calculating the sum of digits using for loop

    public static int sumDigitsForLoop(int number) {
        if (number < 10) {
            return -1;
        }

        int digit;
        int remainder = number;
        int sumDigits = 0;
        for (int i = 0; i <= remainder; i++) {
            digit = remainder % 10;
            sumDigits += digit;
            remainder /= 10;
            if ((remainder) <= 1) {
                sumDigits = sumDigits + (remainder % 10);
                break;
            }
        }
        return sumDigits;
    }

    // Calculating the sum of digits using while loop

    public static int sumDigitsWhileLoop(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            //extract the least significant digit
            int digit = number % 10;
            sum += digit;

            //drop the least significant value
            number /= 10;
        }
        return sum;
    }

    // Number palindrome challenge

    public static boolean isPalindrome(int number) {
        // e.g. number = -1221
        if (number < 0) {
            number *= -1; // number = 1221
        }
        int reverse = 0;
        int numberIterator = number;
        while (numberIterator > 0) {

            int lastDigit = numberIterator % 10; // lastDigit = 1  | lastDigit = 2 | lastDigit = 2 | lastDigit = 1
            reverse *= 10; // reverse = 0 | reverse = 10 | reverse = 120 | reverse = 1220
            reverse += lastDigit; // reverse = 1 | reverse = 12 | reverse = 122 | reverse = 1221
            numberIterator /= 10; // number = 122 | number = 12 | number = 1 | number = 0
        }

        if (number == reverse) {
            return true;
        } else return false;
    }

    // First and Last Digit Sum

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        // number = 252
        int last = number % 10; // last = 2
        int first = 0;

        while (number > 0) {
            if (number / 10 > 0) {
                number /= 10;
            } else {
                first = number;
                break;
            }
        }
        return first + last;
    }

    // Even Digit Sum

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        // number = 252
        int sumEven = 0;
        while (number > 0) {
            int digit = number % 10; // digit = 2
            if (digit % 2 == 0) { // true
                sumEven += digit; // sumEven = 2
            }
            number /= 10; // number = 25
        }
        return sumEven;
    }

    // Shared Digit

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }

        int initialSecondNumber = secondNumber;

        // firstNumber = 12; secondNumber = 13
        while (firstNumber > 0) { // true

            int firstDigit = firstNumber % 10; // 2 | 1

            while (secondNumber > 0) { // true | true
                int secondDigit = secondNumber % 10; // 3 | 1

                if (firstDigit == secondDigit) { // false | true
                    return true;
                }
                secondNumber /= 10; // 1
            }

            firstNumber /= 10; // 1
            secondNumber = initialSecondNumber;

        }
        return false;
    }

    // Last Digit Checker

    // 22, 23, 34

    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (first < 10 || first > 1000 || second < 10 || second > 1000 || third < 10 || third > 1000) {
            return false;
        }

        while (first > 0) { // true
            int firstDigit = first % 10; // 2
            while (second > 0) { // true
                int secondDigit = second % 10; // 3
                if (firstDigit == secondDigit) { // false
                    return true;
                }
                while (third > 0) { // true
                    int thirdDigit = third % 10; // 4
                    if (firstDigit == thirdDigit || secondDigit == thirdDigit) { // false
                        return true;
                    } else
                        return false;
                }
            }
            break;
        }
        return false;
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }

    // Greatest Common Divisor

//    public static int getGreatestCommonDivisor(int first, int second){
//        if(first < 10 || second < 10){
//            return -1;
//        }
//        while(first!=second) {
//            if (first > second) {
//                first = first - second;
//            } else {
//                second = second - first;
//            }
//        }
//        return second;
//    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        //int min = Math.min(first,second);
        int min = first < second ? first : second; // ternary operator to identify which number is min;

        int divisor = 0;
        for (int i = min; i > 1; i--) {
            if (first % i == 0 && second % i == 0) {
                return divisor = i;
            }
        }
        return 1;
    }

    // All factors

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    // Perfect number

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int divisor = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisor += i;
            }
        }
        if (divisor == number) {
            return true;
        }
        return false;
    }

    // Number to words

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int reversedNumber = reverse(number);
        for (int i = 0; i < getDigitCount(number); i++){
            switch (reversedNumber%10){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            reversedNumber /= 10;
        }
    }

    public static int reverse(int number) { //123

        int reverseNumber = 0;

        while(number !=0 ){
            reverseNumber = (reverseNumber*10) + (number%10);
            number /= 10;
        }

        return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int digitCount = 1;

        while (number > 9) {
            digitCount++;
            number /= 10;
        }
        return digitCount;
    }
}
