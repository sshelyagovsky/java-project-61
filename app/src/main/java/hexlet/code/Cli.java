package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String  greeting(int userChoice) {
        Scanner scanner = new Scanner(System.in);
        Engine.questionTitle(userChoice);
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
