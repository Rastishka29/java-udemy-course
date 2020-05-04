public class Main {

    public static void main(String[] args){
        // System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));
//
//        for(int i=2; i<9; i++){
//            System.out.println("10,000 at " + i + "% interest = " +
//                    String.format("%.2f",calculateInterest(10000, i)));
//        }
//
//        System.out.println("***********************************");
//
//        for(int i=8; i>=2; i--){
//            System.out.println("10,000 at " + i + "% interest = " +
//                    String.format("%.2f",calculateInterest(10000, i)));
//        }

//        System.out.println(isPrime(16));

        int countPrime = 0;
        for(int j=10; j<=50; j++){
            if (isPrime(j)){
                if(countPrime >= 3){
                    System.out.println("Exiting for loop");
                    break;
                }
                countPrime ++;
                System.out.println("Number " + j + " is a prime number");
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for(int i=2; i <= (long) Math.sqrt(n); i++){
            System.out.println("Looping " + i);
            if(n % i == 0){
                return false;
            }
        }
//        *******Slower calculation ***********
//        for(int i=2; i <= n/2; i++){
//            System.out.println("Looping " + i);
//            if(n % i == 0){
//                return false;
//            }
//        }
        return true;
    }
}
