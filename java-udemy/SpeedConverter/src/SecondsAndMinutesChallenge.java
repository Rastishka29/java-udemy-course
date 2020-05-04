public class SecondsAndMinutesChallenge {

    public static final String INVALID_MESSAGE_VALUE = "Invalid value"; // Constant value

    public static void main(String[] args) {
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(59, 1));
        System.out.println(getDurationString(60, -1));
        System.out.println(getDurationString(-1, 60));
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(0));
        System.out.println(getDurationString(1));
        System.out.println(getDurationString(60));
        System.out.println(getDurationString(75));
        System.out.println(getDurationString(3645));
    }

    public static String getDurationString (int minutes, int seconds){
        if (minutes < 0 || ((seconds < 0) || (seconds > 59))){
            return INVALID_MESSAGE_VALUE;
        }
        int hours = minutes / 60;
        int remainderMinutes = minutes % 60;

        String hoursString = hours + "h ";
        if (hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainderMinutes + "m ";
        if (remainderMinutes < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }
        return hoursString + minutesString + secondsString;
    }

    public static String getDurationString (int seconds){
        if (seconds < 0){
            return INVALID_MESSAGE_VALUE;
        }
        int minutes = seconds / 60;
        int remainderSeconds = seconds % 60;
        return getDurationString(minutes, remainderSeconds);
    }
}
