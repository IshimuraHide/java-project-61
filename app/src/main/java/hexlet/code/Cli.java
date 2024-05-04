package hexlet.code;


import java.util.Scanner;

public class Cli {

    private String name;


    Cli(String name) {
        this.name = name;
    }

    Cli() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String askUserName () {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String UserName = sc.next();
        System.out.println("Hello, " + UserName + "!");
        return UserName;
    }

}
