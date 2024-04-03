package hexlet.code;
public class App {
    public static void main(String[] args) {
        int userChoice = Games.getGames();

        switch (userChoice) {
            case 1 :
                Cli.greeting();
                break;
            case 2 :
                String userName = Cli.greeting();
                Even.question(userName);
                break;
            case 0 :
                break;
            default:
                System.out.println("incorrect choice");
        }
    }
}
