import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int input;
        int sum = 0;
            while (counter <= 10){
                System.out.println("Enter number #" + counter + ":");
                boolean hasNextInt = scanner.hasNextInt();
                if(hasNextInt){
                    input = scanner.nextInt();
                    sum = sum + input;
                    counter++;
                }else{
                    System.out.println("Invalid Number");
                }
                scanner.nextLine();
            }
        System.out.println("The sum of entered numbers is " + sum);
        scanner.close();
    }
}
