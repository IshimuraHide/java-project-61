package hexlet.code.games;

import java.util.Scanner;


public class Games {


    //проверка ответа если ответ строка
    public  static  boolean compareAnswer(String answer, String answerCorrect) {
        if (answer.equals(answerCorrect)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + answerCorrect);
            return false;
        }
    }
    //Проверка ответа, если переменная целое число
    public  static  boolean compareAnswer(int answer, int answerCorrect) {
        if (answer == answerCorrect) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + answerCorrect);
            return false;
        }
    }

    public static boolean checkIsEven(int tryCount) {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int res = 0;
        while (res < tryCount) {
            int input = (int) (Math.random() * Integer.MAX_VALUE);
            boolean isEven = (input % 2 == 0);
            System.out.println("Question : " + input);
            System.out.print("Answer : ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();
            String answerCorrect = isEven ? "yes" : "no";
            boolean isCorrect = compareAnswer(answer, answerCorrect);
            if (isCorrect) {
                res++;
            } else return false;
        }
        return true;
    }

    public static boolean calculate(int tryCount){

        System.out.println("What is the result of the expression?");
        String[] operators = {"+", "-", "*"};
        int res = 0;
        while (res < tryCount) {
            int number1 = (int) (Math.random() * 100);
            int number2 = (int) (Math.random() * 100);
            int operatorNumber = (int) (Math.random() * operators.length);
            var currentOperator = operators[operatorNumber];

            int answerCorrect = 0;
            switch (currentOperator) {
                case "+":
                    answerCorrect = number1 + number2;
                    break;
                case "-":
                    answerCorrect = number1 - number2;
                    break;
                case "*":
                    answerCorrect = number1 * number2;
                    break;
                default:
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

            boolean isCorrect = compareAnswer(answer, answerCorrect);
            if (isCorrect) {
                res++;
            } else return false;
        }
        return true;

    }


}
