package hexlet.code.games;

import java.util.Arrays;
import java.util.Scanner;

public class Progression {

    private static String description = "What number is missing in the progression?";
    private static int numbersCount = 1;
    public static Games progressionGame = new Games(description, numbersCount);

    public static int[] progression(int startNumber, int stepProgression) {

        int lenProgression = 10; //длина прогрессии

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
}
