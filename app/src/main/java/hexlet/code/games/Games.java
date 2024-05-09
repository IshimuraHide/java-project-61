package hexlet.code.games;

import java.util.Arrays;
import java.util.Scanner;



public class Games {
    private String description;
    private int numbersQuantity;

    public Games(String description, int numbersQuantity) {
        this.description = description;
        this.numbersQuantity = numbersQuantity;
    }
    public Games(){

    }

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

    public static int getRandomNumber() {
        int randomNumber = (int) (Math.random() * 20);
        return randomNumber;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumbersQuantity() {
        return numbersQuantity;
    }

    public void setNumbersQuantity(int numbersQuantity) {
        this.numbersQuantity = numbersQuantity;
    }
}
