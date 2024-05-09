package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Engine packGameData(int tryCount) {
        String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[] results = new String[tryCount];
        String[] expressions = new String[tryCount];
        for (int i = 0; i < tryCount; i++) {
            int number1 = Games.getRandomNumber();

            results[i] = isPrime(number1)? "yes" : "no";
            expressions[i] = String.valueOf(number1);
        }
        return new Engine(description,expressions, results);
    }
}
