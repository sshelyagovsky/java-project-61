package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;
import static hexlet.code.Engine.getRandomNumber;

public class Even {
    private static final int COUNT_ROUND = Engine.pickCountRound();
    private static final int RAN_LOW_LIMIT = 1;
    private static final int RAN_UP_LIMIT = 30;
    private static int cntCorrectAnswers = 0;
    private static boolean isCorrect = true;

    public static void gameEven(String userName, int userChoice) {

        Scanner scanner = new Scanner(System.in);

        Engine.questionTitle(userChoice);

        while (isCorrect && cntCorrectAnswers < COUNT_ROUND) {
            int generatedNumber = getRandomNumber(RAN_LOW_LIMIT, RAN_UP_LIMIT);
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

