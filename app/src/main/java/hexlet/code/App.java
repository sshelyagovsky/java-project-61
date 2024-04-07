package hexlet.code;

public class App {
    public static void main(String[] args) {
        int userChoice = Games.getGames();
        String userName = "";
        switch (userChoice) {
            case 1 :
                Cli.greeting(userChoice);
                break;
            case 2 :
                userName = Cli.greeting(1);
                Even.gameEven(userName, userChoice);
                break;
            case 3 :
                userName = Cli.greeting(1);
                Calc.gameCalculator(userName, userChoice);
                break;
            case 4 :
                userName = Cli.greeting(1);
                Gcd.gameGcd(userName, userChoice);
                break;
            case 5 :
                userName = Cli.greeting(1);
                Progression.gameProgression(userName, userChoice);
                break;
            case 6 :
                userName = Cli.greeting(1);
                Prime.gamePrime(userName, userChoice);
                break;
            case 0 :
                break;
            default:
                System.out.println("Incorrect choice");
        }
    }
}
