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
        Engine eng = new Engine();
        final int tryCount = 3; //количество успешных решений для завершения
        switch (input) {
            case "1" :
                Cli.askUserName();
                return;
            case "2" :
                eng = Even.packGameData(tryCount);
                break;
            case "3" :
                eng = Calc.packGameData(tryCount);
                break;
            case "4" :
                eng = Gcd.packGameData(tryCount);
                break;
            case "5" :
                eng = Progression.packGameData(tryCount);
                break;
            case "6" :
                eng = PrimeNumber.packGameData(tryCount);
                break;
            case "0" :
            default:
                break;
        }
        Engine.runGame(eng, tryCount);


    }
}
