public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean playing = false;

        if ((summer == true) && (temperature >= 25 && temperature <= 45)) {
            playing = true;
        } else {
            if ((summer == false) && (temperature >= 25 && temperature <= 35)) {
                playing = true;
            }
        }
        return playing;
    }
}
