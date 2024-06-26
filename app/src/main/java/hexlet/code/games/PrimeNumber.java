package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Utils.getRandomNumber;

public class PrimeNumber {

    public static boolean isPrime(int number) {
        if (number == 1) {
            return true;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void packGameData() {
        String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][]  questionsAndAnswers = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            final int minNumber = 1;
            final int maxNumber = 10000;
            int number1 = getRandomNumber(minNumber, maxNumber); //число должно быть больше нуля

            questionsAndAnswers[i][0] = String.valueOf(number1);
            questionsAndAnswers[i][1] = isPrime(number1) ? "yes" : "no";

        }
        Engine.runGame(description, questionsAndAnswers);
    }
}
