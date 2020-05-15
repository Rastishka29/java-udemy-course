package rastishka.com;

import org.w3c.dom.ls.LSOutput;

public class LargestPrime {
    //My solution
    public static int getLargestPrime(int number){
        if(number <= 1){
            return -1;
        }
        for(int i=number-1; i>=2; i--){

            if(number%i == 0){
                number = i;
                if (getLargestPrime(number) < 2){
                    return number;
                } else return getLargestPrime(number);
            }
            if (number == i){
                return i;
            }
        }
        return number;
    }

    // Optimal solution

//    public static int getLargestPrime(int number) {
//        if (number < 2) {
//            return -1;
//        }
//        for (int i = 2; i < number; i++) {
//            if ((number % i) == 0) {
//                number /= i;
//                i--;
//            }
//        }
//        return number;
//    }
}
