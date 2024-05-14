package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.App.ROUNDS;
import static hexlet.code.Utils.getRandomNumber;

public class Gcd {

    public static int getGCD(int number1, int number2) {

        int a = number1;
        int b = number2;

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }

    public static void packGameData() {
        String description = "Find the greatest common divisor of given numbers.";
        String[] results = new String[ROUNDS];
        String[] expressions = new String[ROUNDS];

        for (int i = 0; i < ROUNDS; i++) {

            final int minNumber = 1;
            final int maxNumber = 100;

            int number1 = getRandomNumber(minNumber, maxNumber);
            int number2 = getRandomNumber(minNumber, maxNumber);

            results[i] = String.valueOf(getGCD(number1, number2));
            expressions[i] = number1 + " " + number2;
        }
        Engine.runGame(description, expressions, results);
    }
}
