package hexlet.code.games;

import java.util.Scanner;

public class PrimeNumber {

    private static String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static int numbersCount = 1;
    public static Games primeGame = new Games(description, numbersCount);

    public static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
