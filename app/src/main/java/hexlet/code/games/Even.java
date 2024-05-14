package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.App.ROUNDS;
import static hexlet.code.Utils.getRandomNumber;

public class Even {

    public static boolean checkIsEven(int input) {

        return (input % 2 == 0);

    }

    public static void packGameData() {

        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] results = new String[ROUNDS];
        String[] expressions = new String[ROUNDS];

        for (int i = 0; i < ROUNDS; i++) {
            int number1 = getRandomNumber(1, 100);
            results[i] = checkIsEven(number1) ? "yes" : "no";
            expressions[i] = String.valueOf(number1);
        }
        Engine.runGame(description, expressions, results);
    }
}
