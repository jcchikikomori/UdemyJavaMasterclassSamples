public class HighScore {
    public static void main(String[] args) {
        // Initial high score
        int highscore = calculateScore(true, 1500, 1, 0);
        displayHighScore(highscore);
        displayHighScorePosition(highscore);

        highscore = calculateScore(true, 900, 1, 0);
        displayHighScore(highscore);
        displayHighScorePosition(highscore);

        highscore = calculateScore(true, 400, 1, 0);
        displayHighScore(highscore);
        displayHighScorePosition(highscore);

        highscore = calculateScore(true, 50, 1, 0);
        displayHighScore(highscore);
        displayHighScorePosition(highscore);

        highscore = calculateScore(true, 1000, 1, 0);
        displayHighScore(highscore);
        displayHighScorePosition(highscore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            // finalScore += 2000;
            return score + (levelCompleted * bonus);
        }

        return -1;
    }

    public static void displayHighScore(int highScore) {
        System.out.println("Your final score is " + highScore);
    }

    public static void displayHighScorePosition(int highScore) {
        if (highScore >= 1000) {
            System.out.println("Your position is 1st!!");
        }
        else if (highScore >= 500 && highScore < 999) {
            System.out.println("Your position is 2nd!!");
        }
        else if (highScore >= 100 && highScore < 499) {
            System.out.println("Your position is 3rd!!");
        }
        else {
            System.out.println("Your position is 4th!! Sorry!");
        }
    }
}
