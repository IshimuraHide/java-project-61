package hexlet.code.games;

import java.util.Arrays;
import java.util.Scanner;

public class Progression {

    private static String description = "What number is missing in the progression?";
    public static Games progressionGame = new Games(description);

    public static boolean progression(int truCount) {
        System.out.println("What number is missing in the progression?");
        int res = 0;
        int lenProgression = 10; //длина прогрессии
        while (res < truCount) {
            int startNumber = (int) (Math.random() * 10 + 1);
            int stepProgression = (int) (Math.random() * 10 + 2);
            int[] numbers = new int[lenProgression];
            for (int i = 0; i < lenProgression; i++) {
                numbers[i] = startNumber + stepProgression * i;
            }
            String question = "Question : " +  Arrays.toString(numbers)
                    .replace(",", "")
                    .replace("]", "")
                    .replace("[", "");
            System.out.println(question);

            System.out.print("Answer : ");
            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();
            int answerCorrect = stepProgression;

        }
        return true;
    }
}
