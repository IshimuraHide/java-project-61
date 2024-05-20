package hexlet.code;

import java.util.Scanner;


public class Engine {
    public static final int ROUNDS = 3; //количество успешных решений для завершения игры

    public static void runGame(String description, String[][] questionsAndAnswers) {

        String nameClient = Cli.askUserName();
        System.out.println(description);
        int currentTry = 0;

        boolean isWin = false;
        while (currentTry < ROUNDS) {
            System.out.println("Question: " + questionsAndAnswers[currentTry][0]);
            String userAnswer = getUserAnswer();
            String correctAnswer = questionsAndAnswers[currentTry][1];
            isWin = userAnswer.equals(correctAnswer);
            if (isWin) {
                System.out.println("Correct!");
                currentTry++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(."
                                + " Correct answer was '" + correctAnswer + "'");
                break;
            }
        }

        String sucessMessage = "Congratulations, " + nameClient + "!";
        String failureMessage = "Let's try again, " + nameClient + "!";

        System.out.println(currentTry == ROUNDS ? sucessMessage : failureMessage);
    }

    public static String getUserAnswer() {
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }





}
