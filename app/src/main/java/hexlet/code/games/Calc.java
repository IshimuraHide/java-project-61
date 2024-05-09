package hexlet.code.games;

import hexlet.code.Engine;

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
                break;
        }

        return res;
    }

    public static Engine packGameData(int tryCount) {
        String description = "What is the result of the expression?";
        String[] results = new String[tryCount];
        String[] expressions = new String[tryCount];

        for (int i = 0; i < tryCount; i++) {
            int number1 = Engine.getRandomNumber();
            int number2 = Engine.getRandomNumber();
            String[] operators = {"+", "-", "*"};
            int operatorNumber = (int) (Math.random() * operators.length);
            String currentOperator = operators[operatorNumber];
            results[i] = String.valueOf(calculate(number1, number2, currentOperator));
            expressions[i] = number1 + " " +  currentOperator + " " + number2;
        }
        return new Engine(description, expressions, results);
    }

}





