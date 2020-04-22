public class Main {

    // constant
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value!";

    public static void main(String[] args) {
        System.out.println(getDurationString(65,20));
        System.out.println(getDurationString(3459L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }

    private static String getDurationString(long minutes, long seconds) {
        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + " h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = minutes + " min";
        if (minutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + " sec";
        if (minutes < 10) {
            secondsString = "0" + minutesString;
        }

        return hoursString + " " + minutesString + " " + secondsString;
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}