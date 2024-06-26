package hexlet.code;

import java.util.Scanner;


public class Engine {
    public static final int ROUNDS = 3; //количество успешных решений для завершения игры

    public static void runGame(String description, String[][] questionsAndAnswers) {

        String nameClient = Cli.askUserName();
        System.out.println(description);

        boolean isWin = false;
        for (String[] questionsAndAnswer : questionsAndAnswers) {
            System.out.println("Question: " + questionsAndAnswer[0]);
            String correctAnswer = questionsAndAnswer[1];

            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            String userAnswer = sc.next();

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                isWin = true;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(."
                        + " Correct answer was '" + correctAnswer + "'");
                isWin = false;
                break;
            }
        }

        String sucessMessage = "Congratulations, " + nameClient + "!";
        String failureMessage = "Let's try again, " + nameClient + "!";

        System.out.println(isWin ? sucessMessage : failureMessage);
    }

}
