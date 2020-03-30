package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        // Use code blocks even if it's just one line, it makes the code clearer.
        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater that 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("This is executed");
        }
        // scope = accesibility of the variables
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        // Challenge: Print a second score with the following:
		// score set to 1000
		// levelCompleted set to 8
		// bonus set to 200
		// But make sure the first print displays as well.

        // boolean newGameOver = true;
        // int newScore = 1000;
        // int newLevelCompleted = 8;
        // int newBonus = 200;

        // if (newGameOver) {
        //int finalScore = newScore + (newLevelCompleted * newBonus);
        // System.out.println("Your final score was " + finalScore);
//    }
        // duplicated code is not recommended and you can reduce any duplicated code
		score = 1000;
        levelCompleted = 8;
        bonus = 200;
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
				System.out.println("Your final score was " + finalScore);
		}
    }
}
