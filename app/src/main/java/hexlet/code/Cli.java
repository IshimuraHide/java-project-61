package hexlet.code;


import java.util.Scanner;

public class Cli {

    private String name;

    Cli(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void askUserName () {
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String UserName = sc.next();
        System.out.println("Hello, " + UserName + "!");

    }

}
