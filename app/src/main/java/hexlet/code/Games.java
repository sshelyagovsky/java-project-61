package hexlet.code;

import java.util.Scanner;

public class Games {
    public static int getGames() {
        System.out.println("Please enter the game number and press Enter.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Greet\n2 - Even\n0 - Exit");
        System.out.print("Your choice: ");
        int number = scanner.nextInt();
        return number;
    }

}
