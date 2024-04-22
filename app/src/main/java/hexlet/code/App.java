package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    private static final int GREET_NUM = 1;
    private static final int EVEN_NUM = 2;
    private static final int CALC_NUM = 3;
    private static final int GCD_NUM = 4;
    private static final int PROGRESS_NUM = 5;
    private static final int PRIME_NUM = 6;
    private static final int EXIT_NUM = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n"
                + "Your choice: ");
        int userChoice = scanner.nextInt();
        System.out.println();

        switch (userChoice) {
            case GREET_NUM :
                Cli.greeting();
                break;
            case EVEN_NUM :
                Even.start();
                break;
            case CALC_NUM :
                Calc.start();
                break;
            case GCD_NUM :
                Gcd.start();
                break;
            case PROGRESS_NUM :
                Progression.start();
                break;
            case PRIME_NUM :
                Prime.start();
                break;
            case EXIT_NUM :
                break;
            default:
                System.out.println("Incorrect choice");
        }
    }
}