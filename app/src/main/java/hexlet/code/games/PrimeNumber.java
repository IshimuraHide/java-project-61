package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.App.ROUNDS;
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
        String[] results = new String[ROUNDS];
        String[] expressions = new String[ROUNDS];
        for (int i = 0; i < ROUNDS; i++) {
            final int minNumber = 1;
            final int maxNumber = 10000;
            int number1 = getRandomNumber(minNumber, maxNumber); //число должно быть больше нуля

            results[i] = isPrime(number1) ? "yes" : "no";
            expressions[i] = String.valueOf(number1);
        }
        Engine.runGame(description, expressions, results);
    }
}
