package hexlet.code;

import hexlet.code.games.Games;

public class Engine {

    public static void runGame(int input) {

        int tryCount = 3;
        Cli client = new Cli();
        String nameClient = Cli.askUserName();
        client.setName(nameClient);
        String sucessMessage = "Congratulations, " + nameClient + "!";
        String failureMessage = "Let's try again, " + nameClient + "!";
        boolean isWin = false;
        switch (input) {
            case 1 :
                return;
            case 2 :
                isWin = Games.checkIsEven(tryCount);
                break;
            case 3 :
                isWin = Games.calculate(tryCount);
                break;
            case 4 :
                isWin = Games.getGCD(tryCount);
                break;
            case 5 :
                isWin = Games.progression(tryCount);
                break;
            case 6 :
                isWin = Games.isPrime(tryCount);
                break;
            case 0 :
            default:
                break;
        }
        System.out.println(isWin ? sucessMessage : failureMessage);



    }
}
