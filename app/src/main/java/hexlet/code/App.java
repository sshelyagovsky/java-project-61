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
                Even.questionEven(userName, userChoice);
                break;
            case 3 :
                userName = Cli.greeting(1);
                Calc.calculator(userName, userChoice);
                break;
            case 0 :
                break;
            default:
                System.out.println("incorrect choice");
        }
    }
}
