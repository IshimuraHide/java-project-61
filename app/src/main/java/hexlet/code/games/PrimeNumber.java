package hexlet.code.games;

import java.util.Scanner;

public class PrimeNumber {

    private static String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static Games primeGame = new Games(description);

    public static boolean isPrime(int tryCount) {

        //System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int res = 0;
        while (res < tryCount) {
            String answerCorrect = "yes";
            int number = (int) (Math.random() * 100);
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    answerCorrect = "no";
                    break;
                }
            }
            String question = "Question : " + number;
            System.out.println(question);
            System.out.print("Answer : ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();

        }
        return true;
    }
}
