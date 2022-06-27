public class Main {
    public static void main(String[] args) {
        byte challengeByteValue = 69;
        short challengeShortValue = 6969;
        int challengeIntValue = 696969;
        long challengeLongValue = 50000L + 10L * (challengeByteValue + challengeShortValue + challengeIntValue);
        System.out.println("Challenge: " + challengeLongValue);
    }
}