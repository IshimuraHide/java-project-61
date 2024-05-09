package hexlet.code.games;

import java.util.Scanner;

public class Even {

    private static String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static int numbersCount = 1;
    public static Games evenGame = new Games(description, numbersCount);

    public static boolean checkIsEven(int input) {

        //int input = Games.getRandomNumber();
        boolean isEven = (input % 2 == 0);
        //System.out.println("Question : " + input);
        //System.out.print("Answer : ");
        //Scanner sc = new Scanner(System.in);
        //String answer = sc.next();
        //String answerCorrect = isEven ? "yes" : "no";


        return true;
    }
}
