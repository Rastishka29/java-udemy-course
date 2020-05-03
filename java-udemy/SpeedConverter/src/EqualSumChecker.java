public class EqualSumChecker {
    public static boolean hasEqualSum (int firstValue, int secondValue, int thirdValue){
        return firstValue + secondValue == thirdValue;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(-1,1,0));
    }
}
