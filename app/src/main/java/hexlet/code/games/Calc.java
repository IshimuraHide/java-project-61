package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS;
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

        String[][]  questionsAndAnswers = new String[ROUNDS][2];

        for (int i = 0; i < ROUNDS; i++) {
            final int minNumber = 1;
            final int maxNumber = 50;
            int number1 = getRandomNumber(minNumber, maxNumber);
            int number2 = getRandomNumber(minNumber, maxNumber);
            String[] operators = {"+", "-", "*"};
            int operatorNumber = getRandomNumber(0, operators.length);
            String currentOperator = operators[operatorNumber];

            questionsAndAnswers[i][0] = number1 + " " +  currentOperator + " " + number2;
            questionsAndAnswers[i][1] = String.valueOf(calculate(number1, number2, currentOperator));

        }
        Engine.runGame(description, questionsAndAnswers);
    }

}





