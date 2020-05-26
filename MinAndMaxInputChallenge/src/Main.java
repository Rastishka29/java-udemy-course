import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        int min = 0;
        int max = 0;
        boolean isFirstRun = true;

        while (true){
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                input = scanner.nextInt();
                if (isFirstRun){
                    isFirstRun = false;
                    min = input;
                    max = input;
                }
                if(input > max){
                    max = input;
                }

                if(input < min){
                    min = input;
                }
            } else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
        scanner.close();
    }
}
