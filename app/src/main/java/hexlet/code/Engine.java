package hexlet.code;

import hexlet.code.games.Games;

public class Engine {

    public static void runGame(Games game) {

        int tryCount = 3;
        Cli client = new Cli();
        String nameClient = Cli.askUserName();
        client.setName(nameClient);
        System.out.println(game.getDescription());

        String sucessMessage = "Congratulations, " + nameClient + "!";
        String failureMessage = "Let's try again, " + nameClient + "!";
        boolean isWin = false;

        System.out.println(isWin ? sucessMessage : failureMessage);



    }
}
