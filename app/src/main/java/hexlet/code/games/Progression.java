package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Scanner;

public class Progression {

    public static int[] progression(int startNumber, int stepProgression, int lenProgression) {

        //int lenProgression = 10; //длина прогрессии

        int[] numbers = new int[lenProgression];
        for (int i = 0; i < lenProgression; i++) {
            numbers[i] = startNumber + stepProgression * i;
        }
        //String question = "Question : " +  Arrays.toString(numbers)
         //       .replace(",", "")
         //       .replace("]", "")
         //       .replace("[", "");
        //System.out.println(question);

        //System.out.print("Answer : ");
        //Scanner sc = new Scanner(System.in);
        //int answer = sc.nextInt();
        //int answerCorrect = stepProgression;


        return numbers;
    }

    public static Engine packGameData() {

        String description = "What number is missing in the progression?";
        int firstNumber = Games.getRandomNumber();
        int step = Games.getRandomNumber();
        int lenProgression = 10; //длина прогрессии
        int lostNumberPlace = (int) (Math.random() * lenProgression);
        int[] numbers = progression(firstNumber, step, lenProgression);
        String res = String.valueOf(numbers[lostNumberPlace]);
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < lenProgression; i++) {
            strBuilder.append(i == lostNumberPlace? ".." : numbers[i]);
            strBuilder.append(" ");
        }
        String expression = strBuilder.toString();

        return new Engine(description,expression, res);
    }

    public static Engine packGameData(int tryCount) {

        int lenProgression = 10; //длина прогрессии


        StringBuilder strBuilder = new StringBuilder();

        String description = "What is the result of the expression?";
        String[] results = new String[tryCount];
        String[] expressions = new String[tryCount];

        for (int i = 0; i < tryCount; i++) {

            int lostNumberPlace = (int) (Math.random() * lenProgression);
            int firstNumber = Games.getRandomNumber();
            int step = Games.getRandomNumber();

            int[] numbers = progression(firstNumber, step, lenProgression);

            for (int j = 0; j < lenProgression; j++) {
                strBuilder.append(j == lostNumberPlace? ".." : numbers[j]);
                strBuilder.append(" ");
            }

            String expression = strBuilder.toString();
            String res = String.valueOf(numbers[lostNumberPlace]);

            results[i] = res;
            expressions[i] = expression;          ;
        }
        return new Engine(description,expressions, results);
    }
}
