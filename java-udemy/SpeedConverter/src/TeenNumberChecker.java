public class TeenNumberChecker {
    public static boolean isTeen(int age){
        return age >= 13 && age <= 19;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge){
        return isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge);
    }

    public static void main(String[] args) {
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
        System.out.println(hasTeen(9, 99, 19));
    }
}
