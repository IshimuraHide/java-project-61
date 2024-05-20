package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Utils.getRandomNumber;

public class Even {

    public static boolean checkIsEven(int input) {

        return (input % 2 == 0);

    }

    public static void packGameData() {

        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][]  questionsAndAnswers = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            final int minNumber = 1;
            final int maxNumber = 100;
            int number1 = getRandomNumber(minNumber, maxNumber);

            questionsAndAnswers[i][0] = String.valueOf(number1);
            questionsAndAnswers[i][1] = checkIsEven(number1) ? "yes" : "no";

        }
        Engine.runGame(description, questionsAndAnswers);
    }
}
