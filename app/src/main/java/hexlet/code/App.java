package hexlet.code;

import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static final int GREET_NUM = 1;
    public static final int EVEN_NUM = 2;
    public static final int CALC_NUM = 3;
    public static final int GCD_NUM = 4;
    public static final int PROGRESS_NUM = 5;
    public static final int PRIME_NUM = 6;
    public static final int EXIT_NUM = 0;

    public static void main(String[] args) {
        int userChoice = Engine.getGames();
        String userName = "";
        switch (userChoice) {
            case GREET_NUM :
                Cli.greeting(userChoice);
                break;
            case EVEN_NUM :
                userName = Cli.greeting(1);
                Even.gameEven(userName, userChoice);
                break;
            case CALC_NUM :
                userName = Cli.greeting(1);
                Calc.gameCalculator(userName, userChoice);
                break;
            case GCD_NUM :
                userName = Cli.greeting(1);
                Gcd.gameGcd(userName, userChoice);
                break;
            case PROGRESS_NUM :
                userName = Cli.greeting(1);
                Progression.gameProgression(userName, userChoice);
                break;
            case PRIME_NUM :
                userName = Cli.greeting(1);
                Prime.gamePrime(userName, userChoice);
                break;
            case EXIT_NUM :
                break;
            default:
                System.out.println("Incorrect choice");
        }
    }
}
