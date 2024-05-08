package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.games.Games;

public class Calc {

    private static String description = "What is the result of the expression?";
    public static Games calcGame = new Games(description);


    public static int calculate() {

        //System.out.println("What is the result of the expression?");
        String[] operators = {"+", "-", "*"};

        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);
        int operatorNumber = (int) (Math.random() * operators.length);
        var currentOperator = operators[operatorNumber];

        int res = 0;
        switch (currentOperator) {
            case "+":
                res = number1 + number2;
                break;
            case "-":
                res = number1 - number2;
                break;
            case "*":
                res = number1 * number2;
                break;
            default:
                break;
        }
        String question = "Question : " + number1 + " " + currentOperator + " " + number2;
        System.out.println(question);
        System.out.print("Answer : ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

    return res;

    }


}
