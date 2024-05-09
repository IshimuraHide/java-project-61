package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Gcd {

    public static int getGCD(int number1, int number2) {

        //int number1 = (int) (Math.random() * 20);
        //int number2 = (int) (Math.random() * 20);
        int a = number1;
        int b = number2;

        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }

        return a;
    }

    public static Engine packGameData(int tryCount) {
        String description = "What is the result of the expression?";
        String[] results = new String[tryCount];
        String[] expressions = new String[tryCount];

        for (int i = 0; i < tryCount; i++) {

            int number1 = Games.getRandomNumber();
            int number2 = Games.getRandomNumber();

            results[i] = String.valueOf(getGCD(number1, number2));
            expressions[i] = number1 + " " + number2;
        }
        return new Engine(description,expressions, results);
    }
}
