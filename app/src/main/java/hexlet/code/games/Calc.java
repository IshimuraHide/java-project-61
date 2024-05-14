package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.App.ROUNDS;
import static hexlet.code.Utils.getRandomNumber;

public class Calc {

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
                throw new Error("Неизвестное действие:" + "'" + currentOperator + "'");
        }

        return res;
    }

    public static void packGameData() {

        String description = "What is the result of the expression?";
        String[] results = new String[ROUNDS];
        String[] expressions = new String[ROUNDS];

        for (int i = 0; i < ROUNDS; i++) {
            int number1 = getRandomNumber(10, 100);
            int number2 = getRandomNumber(10, 100);
            String[] operators = {"+", "-", "*"};
            int operatorNumber = getRandomNumber(0, operators.length);
            String currentOperator = operators[operatorNumber];
            results[i] = String.valueOf(calculate(number1, number2, currentOperator));
            expressions[i] = number1 + " " +  currentOperator + " " + number2;
        }
        Engine.runGame(description, expressions, results);
    }

}





