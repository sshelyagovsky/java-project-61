package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int COUNT_ROUND = 3;

    public static int getCountRound() {
        return COUNT_ROUND;
    }
    public static void startGame(String description, String[][] gameParam) {
        var isCorrect = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n"
                + "May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);

        for (var i = 0; i < COUNT_ROUND && isCorrect; i++) {
            var computerQuestion = gameParam[i][0];
            var computerAnswer = gameParam[i][1];

            System.out.println("Question: " + computerQuestion);
            System.out.print("Your answer: ");
            var userAnswer = scanner.nextLine();

            if (userAnswer.equals(computerAnswer)) {
                isCorrect = true;
                System.out.println("Correct!");
            } else {
                isCorrect = false;
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + computerAnswer + "'");
            }
        }
        String text = isCorrect ? "Congratulations" : "Let's try again";
        System.out.println(text + ", " + userName + "!");
    }
}
