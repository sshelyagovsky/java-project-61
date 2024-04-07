package hexlet.code;

import java.util.Scanner;
import static hexlet.code.GenerateRandom.getRandomNumber;
public class Gcd {
    private static int index = Engine.pickCountRound();
    private static int cntCorrectAnswers = 0;
    private static int ranLowLimit = 1;
    private static int ranUpLimit = 30;
    private static boolean isCorrect = true;

    public static void gameGcd(String userName, int userChoice) {

        Scanner scanner = new Scanner(System.in);

        Engine.questionTitle(userChoice);

        while (isCorrect && cntCorrectAnswers < index) {
            int value1 = getRandomNumber(ranLowLimit, ranUpLimit);
            int value2 = getRandomNumber(ranLowLimit, ranUpLimit);
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
