package hexlet.code;

import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    private static final int GREET_NUM = 1;
    private static final int EVEN_NUM = 2;
    private static final int CALC_NUM = 3;
    private static final int GCD_NUM = 4;
    private static final int PROGRESS_NUM = 5;
    private static final int PRIME_NUM = 6;
    private static final int EXIT_NUM = 0;

    public static void main(String[] args) {
        int userChoice = Engine.getGames();
        String userName = "";
        switch (userChoice) {
            case GREET_NUM :
                Cli.greeting(userChoice);
                break;
            case EVEN_NUM :
                userName = Cli.greeting(GREET_NUM);
                Even.gameEven(userName, userChoice);
                break;
            case CALC_NUM :
                userName = Cli.greeting(GREET_NUM);
                Calc.gameCalculator(userName, userChoice);
                break;
            case GCD_NUM :
                userName = Cli.greeting(GREET_NUM);
                Gcd.gameGcd(userName, userChoice);
                break;
            case PROGRESS_NUM :
                userName = Cli.greeting(GREET_NUM);
                Progression.gameProgression(userName, userChoice);
                break;
            case PRIME_NUM :
                userName = Cli.greeting(GREET_NUM);
                Prime.gamePrime(userName, userChoice);
                break;
            case EXIT_NUM :
                break;
            default:
                System.out.println("Incorrect choice");
        }
    }
}
