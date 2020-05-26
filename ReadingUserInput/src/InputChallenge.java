import java.util.Scanner;

public class InputChallenge {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        int number;

        while(true){
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                counter ++;
                number = scanner.nextInt();
                sum += number;
                scanner.nextLine();

            }else{
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum/counter));
        scanner.close();
    }
}
