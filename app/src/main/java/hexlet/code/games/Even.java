package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static boolean checkIsEven(int input) {

        return (input % 2 == 0);

    }

    public static Engine packGameData(int tryCount) {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] results = new String[tryCount];
        String[] expressions = new String[tryCount];

        for (int i = 0; i < tryCount; i++) {
            int number1 = Engine.getRandomNumber();
            results[i] = checkIsEven(number1) ? "yes" : "no";
            expressions[i] = String.valueOf(number1);
        }
        return new Engine(description, expressions, results);
    }
}
