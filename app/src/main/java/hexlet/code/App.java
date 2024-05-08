package hexlet.code;


import hexlet.code.games.*;

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
        int input = sc.nextInt();
        Games game = new Games();
        switch (input) {
            case 1 :
                return;
            case 2 :
                game = Even.evenGame;
                break;
            case 3 :
                game = Calc.calcGame;
                break;
            case 4 :
                game = Gcd.gcdGame;
                break;
            case 5 :
                game = Progression.progressionGame;
                break;
            case 6 :
                game = PrimeNumber.primeGame;
                break;
            case 0 :
            default:
                break;
        }
        Engine.runGame(game);


    }
}
