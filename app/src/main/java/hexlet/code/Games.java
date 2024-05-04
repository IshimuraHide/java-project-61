package hexlet.code;

import java.util.Scanner;


public class Games {

    public static void checkIsEven(String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int res = 0;
        while (res < 3) {
            int input = (int) (Math.random() * Integer.MAX_VALUE);
            boolean isEven = (input % 2 == 0);
            System.out.println("Question : " + input);
            System.out.print("Answer : ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();
            if ((isEven && answer.equals("yes")) || (!isEven && answer.equals("no"))) {
                System.out.println("Correct!");
                res++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (isEven ? "'yes'" : "'no'"));
                break;

            }

        }
        if (res == 3) {
            System.out.println("Congratulations, " + name);
        }
    }

    public static void calculate(){
        System.out.println("Please enter the game number and press Enter.");
    }
}
