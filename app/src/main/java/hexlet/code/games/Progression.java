package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static int[] progression(int startNumber, int stepProgression, int lenProgression) {

        int[] numbers = new int[lenProgression];
        for (int i = 0; i < lenProgression; i++) {
            numbers[i] = startNumber + stepProgression * i;
        }
        return numbers;

    }

    public static Engine packGameData(int tryCount) {

        final int lenProgression = 10; //длина прогрессии

        String description = "What number is missing in the progression?";
        String[] results = new String[tryCount];
        String[] expressions = new String[tryCount];

        for (int i = 0; i < tryCount; i++) {

            int lostNumberPlace = (int) (Math.random() * lenProgression);
            int firstNumber = Engine.getRandomNumber();
            int step = Engine.getRandomNumber();

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
        return new Engine(description, expressions, results);
    }
}
