package com.company;

public class Main<display> {

    public static void main(String[] args) {
//	    boolean gameOver = true;
//	    int score = 800;
//	    int levelCompleted = 5;
//	    int bonus = 100;
//
//	    int highScore = calculateScore(true, 800, levelCompleted, bonus);
//		System.out.println(highScore);
//
//		score = 10000;
//	    levelCompleted =  8;
//	    bonus = 200;
//
//		highScore = calculateScore(true, 10000, 8, 200);
//		System.out.println(highScore);
//
//		if (gameOver) {
//	        int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//	    }
//    }
//    // write a new method calculateScore
//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//		if (gameOver) {
//			int finalScore = score + (levelCompleted * bonus);
//			finalScore += 1000;
//			return finalScore;
//		} else {
//			return -1;
//		}
//
//	}

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".

        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if the score is >= 1000
        // 2 if the score is >= 500 and < 1000
        // 3 if the score is >= 100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50

        int calculateHighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Sonia", calculateHighScorePosition);

        calculateHighScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Diana", calculateHighScorePosition);

        calculateHighScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Lili", calculateHighScorePosition);

        calculateHighScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Ruxi", calculateHighScorePosition);

        calculateHighScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Louise", calculateHighScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//            return 4;
		int position = 4; // assuming position 4 will be returned
		if (playerScore > 1000) {
			position = 1;
		} else if (playerScore >= 500) {
			position = 2;
		} else if (playerScore >= 100) {
			position = 3;
		}
		return position;
    }
}
