package hexlet.code.games;

import java.util.Scanner;

public class Gcd {

    private static String description = "Find the greatest common divisor of given numbers.";
    public static Games gcdGame = new Games(description);

    public static boolean getGCD(int tryCount) {
        //System.out.println("Find the greatest common divisor of given numbers.");
        int res = 0;
        while (res < tryCount) {

            int number1 = (int) (Math.random() * 20);
            int number2 = (int) (Math.random() * 20);
            int a = number1;
            int b = number2;

            while (b != 0) {
                int tmp = a % b;
                a = b;
                b = tmp;
            }
            int answerCorrect = a;

            String question = "Question : " +  number1 + " " + number2;
            System.out.println(question);

            System.out.print("Answer : ");
            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();


        }
        return true;
    }
}
