public class BarkingDog {
    public static boolean shouldWakeUp(boolean isDogBarking, int hourOfTheDay) {
        if (hourOfTheDay >= 0 && hourOfTheDay <= 23) {
            if (isDogBarking) {
                if (hourOfTheDay < 8 || hourOfTheDay > 22) {
                    System.out.println(true);
                    return true;
                }
            }
        } return false;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, 22));
        System.out.println(shouldWakeUp(false, 22));
        System.out.println(shouldWakeUp(true, 21));
        System.out.println(shouldWakeUp(true, 23));
        System.out.println(shouldWakeUp(true, 0));
        System.out.println(shouldWakeUp(true, -1));
    }
}
