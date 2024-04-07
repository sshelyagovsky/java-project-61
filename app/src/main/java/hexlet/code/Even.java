package hexlet.code;

import java.util.Scanner;
import static hexlet.code.GenerateRandom.getRandomNumber;
public class Even {
    private static int index = Engine.pickCountRound();
    private static int ranLowLimit = 1;
    private static int ranUpLimit = 30;
    private static int cntCorrectAnswers = 0;
    private static boolean isCorrect = true;
    public static void gameEven(String userName, int userChoice) {

        Scanner scanner = new Scanner(System.in);

        Engine.questionTitle(userChoice);

        while (isCorrect && cntCorrectAnswers < index) {
            int generatedNumber = getRandomNumber(ranLowLimit, ranUpLimit);
            String computeAnswer = isEven(generatedNumber) ? "yes" : "no";

            Engine.questionMain(String.valueOf(generatedNumber));
            Engine.answer();

            String userAnswer = scanner.nextLine();
            isCorrect = Engine.checkAnswer(userAnswer, computeAnswer);
            cntCorrectAnswers++;
        }
        Engine.checkCorrectAnswer(isCorrect, userName);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

