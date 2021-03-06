public class Main {
    public static void main(String[] args) {
        int highscore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score is " + highscore);
        highscore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score is " + highscore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }
}