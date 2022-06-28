public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        // Limits for summer: 25-45
        int minimum = 25;
        if (summer) {
            return (temperature >= minimum && temperature <= 45);
        }
        return (temperature >= minimum && temperature <= 35);
    }
}
