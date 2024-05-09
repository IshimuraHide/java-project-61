package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Engine;
import hexlet.code.games.Games;

public class Calc {
    //private static String description = "What is the result of the expression?";

    public static int calculate(int number1, int number2, String currentOperator) {

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
        //String question = "Question : " + number1 + " " + currentOperator + " " + number2;
        //System.out.println(question);
        //System.out.print("Answer : ");
        //Scanner sc = new Scanner(System.in);
        //int answer = sc.nextInt();

    return res;
    }

    public static Engine packGameData() {
        String description = "What is the result of the expression?";

        int number1 = Games.getRandomNumber();
        int number2 = Games.getRandomNumber();

        String[] operators = {"+", "-", "*"};
        int operatorNumber = (int) (Math.random() * operators.length);
        String currentOperator = operators[operatorNumber];;

        int res = calculate(number1, number2, currentOperator);

        String expression = number1 + " " +  currentOperator +" " +number2;

        return new Engine(description,expression, res);
    }


    }





