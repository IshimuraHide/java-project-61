package hexlet.code;

import hexlet.code.games.Games;
import hexlet.code.games.Calc;

import java.util.Scanner;

public class Engine {
    private String description;
    private int number1;
    private int number2;
    private String expression;
    private String result;
    private boolean isCorrect;
    private int[] numbers;
    private String[] expressions;
    private String[] results;
    public Engine() {

    }
    //конструктор для данных калькулятора, НОД
    public Engine(String description, String expression, String result){
        this.description = description;
        this.expression = expression;
        this.result = result;
    }
    public Engine(String description, String[] expressions, String[] results){
        this.description = description;
        this.expressions = expressions;
        this.results = results;
    }
    //конструктор для игры в чет/нечет,постое число
    Engine(String description, int number1, String result){
        this.description = description;
        this.number1 = number1;
        this.result = result;
    }
    //конструктор для игры в прогрессию
    Engine(String description, int[] numbers, String result){
        this.description = description;
        this.numbers = numbers;
        this.result = result;;
    }

    public static void runGame(Engine eng, int tryCount) {

        String nameClient = Cli.askUserName();
        System.out.println(eng.getDescription());
        int currentTry = 0;

        boolean isWin = false;
        while (currentTry < tryCount) {
            System.out.println(getGameQuestion(eng, currentTry));
            String UserAnswer = getUserAnswer();
            String correctAnswer = eng.getResult(currentTry);
            isWin = UserAnswer.equals(correctAnswer);
            if (isWin) {
                System.out.println("Correct!");
                currentTry++;
            } else {
                System.out.println("'" + UserAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer);
                break;
            }
        }

        String sucessMessage = "Congratulations, " + nameClient + "!";
        String failureMessage = "Let's try again, " + nameClient + "!";

        System.out.println(currentTry == tryCount ? sucessMessage : failureMessage);
    }



    public static String getGameQuestion(Engine eng, int Count) {

            String message = "Question : " + eng.getExpression(Count);
            return message;
    }

    public static String getUserAnswer(){
        System.out.print("Answer : ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getResult(int currentTry) {
        return results[currentTry];
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public String getExpression(int count) {
        return expressions[count];
    }






}
