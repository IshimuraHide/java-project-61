package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.App.ROUNDS;
import static hexlet.code.Utils.getRandomNumber;

public class Progression {

    public static int[] progression(int startNumber, int stepProgression, int lenProgression) {

        int[] numbers = new int[lenProgression];
        for (int i = 0; i < lenProgression; i++) {
            numbers[i] = startNumber + stepProgression * i;
        }
        return numbers;

    }

    public static void packGameData() {

        final int lenProgression = 10; //длина прогрессии

        String description = "What number is missing in the progression?";
        String[] results = new String[ROUNDS];
        String[] expressions = new String[ROUNDS];

        for (int i = 0; i < ROUNDS; i++) {
            final int minNumber = 1;
            final int maxNumber = 50;
            final int firstNumberPosition = 0;

            int lostNumberPlace = getRandomNumber(firstNumberPosition, lenProgression - 1);
            int firstNumber = getRandomNumber(minNumber, maxNumber);
            int step = getRandomNumber(minNumber, maxNumber);

            int[] numbers = progression(firstNumber, step, lenProgression);

            StringBuilder strBuilder = new StringBuilder();
            for (int j = 0; j < lenProgression; j++) {
                strBuilder.append(j == lostNumberPlace ? ".." : numbers[j]);
                strBuilder.append(" ");
            }

            String expression = strBuilder.toString();
            String res = String.valueOf(numbers[lostNumberPlace]);

            results[i] = res;
            expressions[i] = expression;
        }
        Engine.runGame(description, expressions, results);
    }
}
