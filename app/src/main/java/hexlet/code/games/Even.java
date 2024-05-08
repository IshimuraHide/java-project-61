package hexlet.code.games;

import java.util.Scanner;

public class Even {

    private static String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static Games evenGame = new Games(description);

    public static boolean checkIsEven(int tryCount) {

        //System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int res = 0;
        while (res < tryCount) {
            int input = (int) (Math.random() * Integer.MAX_VALUE);
            boolean isEven = (input % 2 == 0);
            System.out.println("Question : " + input);
            System.out.print("Answer : ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();
            String answerCorrect = isEven ? "yes" : "no";

        }
        return true;
    }
}
