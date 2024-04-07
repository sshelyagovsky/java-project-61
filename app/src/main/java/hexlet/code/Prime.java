package hexlet.code;

import java.util.Scanner;
import static hexlet.code.GenerateRandom.getRandomNumber;
public class Prime {
    private static int index = Engine.pickCountRound();
    private static int cntCorrectAnswers = 0;
    private static boolean isCorrect = true;
    private static int ranLowLimit = 2;
    private static int ranUpLimit = 30;

    public static void gamePrime(String userName, int userChoice) {

        Scanner scanner = new Scanner(System.in);

        Engine.questionTitle(userChoice);

        while (isCorrect && cntCorrectAnswers < index) {
            int generatedNumber = getRandomNumber(ranLowLimit, ranUpLimit);
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
