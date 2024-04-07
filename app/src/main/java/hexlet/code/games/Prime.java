package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;
import static hexlet.code.Engine.getRandomNumber;

public class Prime {
    public static final int  INDEX = Engine.pickCountRound();
    public static final int RAN_LOW_LIMIT = 2;
    public static final int RAN_UP_LIMIT = 30;
    public static boolean isCorrect = true;
    public static int cntCorrectAnswers = 0;

    public static void gamePrime(String userName, int userChoice) {

        Scanner scanner = new Scanner(System.in);

        Engine.questionTitle(userChoice);

        while (isCorrect && cntCorrectAnswers < INDEX) {
            int generatedNumber = getRandomNumber(RAN_LOW_LIMIT, RAN_UP_LIMIT);
            String computeAnswer = isPrimeNumber(generatedNumber) ? "yes" : "no";

            Engine.questionMain(String.valueOf(generatedNumber));
            Engine.answer();

            String userAnswer = scanner.nextLine();
            isCorrect = Engine.checkAnswer(userAnswer, computeAnswer);
            cntCorrectAnswers++;
        }
        Engine.checkCorrectAnswer(isCorrect, userName);
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
