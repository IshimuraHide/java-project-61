package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String description;
    private static String[] expressions;
    private static String[] results;
    public Engine() {

    }

    public Engine(String descr, String[] expr, String[] res) {
        description = descr;
        expressions = expr;
        results = res;
    }

    public static void runGame(Engine eng, int tryCount) {

        String nameClient = Cli.askUserName();
        System.out.println(eng.getDescription());
        int currentTry = 0;

        boolean isWin = false;
        while (currentTry < tryCount) {
            System.out.println(getGameQuestion(eng, currentTry));
            String userAnswer = getUserAnswer();
            String correctAnswer = eng.getResult(currentTry);
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

        System.out.println(currentTry == tryCount ? sucessMessage : failureMessage);
    }

    public static String getGameQuestion(Engine eng, int count) {

        String message = "Question: " + eng.getExpression(count);
        return message;
    }

    public static String getUserAnswer() {
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static String getDescription() {

        return description;

    }

    public static String getResult(int currentTry) {

        return results[currentTry];

    }

    public static String getExpression(int count) {

        return expressions[count];

    }

    public static int getRandomNumber() {
        final int randomMax = 20;
        return (int) (Math.random() * randomMax);

    }

}
