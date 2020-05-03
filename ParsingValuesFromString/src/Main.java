public class Main {
    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println("numberAsString= " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number= " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString= " + numberAsString); // The number 1 is concatenated to "2018" String, because Java automatically transform 1 to String
        System.out.println("number= " + number);

    }
}
