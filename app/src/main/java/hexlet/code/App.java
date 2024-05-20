package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        switch (input) {
            case "1" :
                Cli.askUserName();
                return;
            case "2" :
                Even.packGameData();
                break;
            case "3" :
                Calc.packGameData();
                break;
            case "4" :
                Gcd.packGameData();
                break;
            case "5" :
                Progression.packGameData();
                break;
            case "6" :
                PrimeNumber.packGameData();
                break;
            case "0" :
                break;
            default:
                System.out.println("Ни одна игра не выбрана");
                break;
        }
    }
}
