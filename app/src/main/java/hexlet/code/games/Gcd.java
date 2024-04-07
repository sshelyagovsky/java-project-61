package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;
import static hexlet.code.Engine.getRandomNumber;

public class Gcd {
    private static final int COUNT_ROUND = Engine.pickCountRound();
    private static final int RAN_LOW_LIMIT = 1;
    private static final int RAN_UP_LIMIT = 30;
    private static int cntCorrectAnswers = 0;
    private static boolean isCorrect = true;

    public static void gameGcd(String userName, int userChoice) {

        Scanner scanner = new Scanner(System.in);

        Engine.questionTitle(userChoice);

        while (isCorrect && cntCorrectAnswers < COUNT_ROUND) {
            int value1 = getRandomNumber(RAN_LOW_LIMIT, RAN_UP_LIMIT);
            int value2 = getRandomNumber(RAN_LOW_LIMIT, RAN_UP_LIMIT);
            int computeAnswer = gcd(value1, value2);

            Engine.questionMain(value1 + " " + value2);
            Engine.answer();

            String userAnswer = scanner.nextLine();
            isCorrect = Engine.checkAnswer(String.valueOf(userAnswer), String.valueOf(computeAnswer));
            cntCorrectAnswers++;
        }
        Engine.checkCorrectAnswer(isCorrect, userName);
    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}
