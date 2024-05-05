package hexlet.code;

import java.util.Scanner;


public class Games {

    public static void checkIsEven(String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int res = 0;
        while (res < 3) {
            int input = (int) (Math.random() * Integer.MAX_VALUE);
            boolean isEven = (input % 2 == 0);
            System.out.println("Question : " + input);
            System.out.print("Answer : ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();
            if ((isEven && answer.equals("yes")) || (!isEven && answer.equals("no"))) {
                System.out.println("Correct!");
                res++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (isEven ? "'yes'" : "'no'"));
                break;
            }
        }
        if (res == 3) {
            System.out.println("Congratulations, " + name);
        }
    }

    public static void calculate(){

        System.out.println("What is the result of the expression?");
        String[] operators = {"+", "-", "*"};
        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);
        int operatorNumber = (int) (Math.random()*operators.length);
        var currentOperator = operators[operatorNumber];

        int answerCorrect = 0;
        switch (currentOperator) {
            case "+" :
                answerCorrect = number1 + number2;
                break;
            case "-" :
                answerCorrect = number1 - number2;
                break;
            case "*" :
                answerCorrect = number1 * number2;
                break;
            default :
                break;
        }
        StringBuilder expStrBuilder = new StringBuilder();
        expStrBuilder.append(number1);
        expStrBuilder.append(" ");
        expStrBuilder.append(currentOperator);
        expStrBuilder.append(" ");
        expStrBuilder.append(number2);
        String expression = expStrBuilder.toString();
        StringBuilder questionStrBuilder = new StringBuilder(expStrBuilder);
        questionStrBuilder.insert(0, "Question : ");
        String question = questionStrBuilder.toString();
        System.out.println(question);
        System.out.println("Answer : ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        int res = 0;
        if (answer == answerCorrect) {
            System.out.println("Correct!");
            res++;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + answerCorrect);
            System.out.println("Let's try again, Sam!");
        }

    }
}
