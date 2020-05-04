public class FeetAndInchesConverter {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(5,8);
        calcFeetAndInchesToCentimeters(300);
        calcFeetAndInchesToCentimeters(340);
        calcFeetAndInchesToCentimeters(0);
        calcFeetAndInchesToCentimeters(-1);
        calcFeetAndInchesToCentimeters(12);
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){
        if (feet < 0 || ((inches < 0) || (inches > 12))){
            System.out.println("Invalid feet or inches parameter");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, "+ inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            System.out.println(inches + " is an invalid inches parameter");
            return -1;
        }
        double totalFeet = (int) inches / 12;
        double remainderInches = (int) inches % 12;
        System.out.println(inches + " inches is " + totalFeet + " feet and " + remainderInches + " inches");
        return calcFeetAndInchesToCentimeters(totalFeet,remainderInches);
    }
}
