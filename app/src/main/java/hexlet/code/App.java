package hexlet.code;


import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Cli client = new Cli();
        switch (input) {
            case "1" :
                client.setName(Cli.askUserName());
                break;
            case "2" :
                client.setName(Cli.askUserName());
                Games.checkIsEven(client.getName());
                break;
            case "3" :
                client.setName(Cli.askUserName());
                break;
            case "0" :
            default:
                break;
        }

    }
}
