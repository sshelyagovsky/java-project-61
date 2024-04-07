package hexlet.code;

import java.util.Scanner;
import static hexlet.code.GenerateRandom.*;
public class Gcd {
    public static void gameGcd(String userName, int userChoice) {
        int index = Engine.pickCountRound();
        int cntCorrectAnswers = 0;
        int ranLowLimit = 1;
        int ranUpLimit = 30;
        boolean isCorrect = true;
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
