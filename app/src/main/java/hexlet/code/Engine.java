package hexlet.code;

import java.util.Scanner;

public class Engine {
    private String description;
    private String[] expressions;
    private String[] results;
    public Engine() {

    }

    //конструктор данных для движка
    public Engine(String description, String[] expressions, String[] results) {
        this.description = description;
        this.expressions = expressions;
        this.results = results;
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
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer);
                break;
            }
        }

        String sucessMessage = "Congratulations, " + nameClient + "!";
        String failureMessage = "Let's try again, " + nameClient + "!";

        System.out.println(currentTry == tryCount ? sucessMessage : failureMessage);
    }

    public static String getGameQuestion(Engine eng, int count) {

        String message = "Question : " + eng.getExpression(count);
        return message;
    }

    public static String getUserAnswer() {
        System.out.print("Answer : ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public String getDescription() {

        return description;

    }

    public String getResult(int currentTry) {

        return results[currentTry];

    }

    public String getExpression(int count) {

        return expressions[count];

    }

    public static int getRandomNumber() {

        return (int) (Math.random() * 20);

    }

}
