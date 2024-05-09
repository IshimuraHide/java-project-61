package hexlet.code.games;

import java.util.Scanner;

public class Gcd {

    private static String description = "Find the greatest common divisor of given numbers.";
    private static int numbersCount = 2;
    public static Games gcdGame = new Games(description,numbersCount);

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
}
