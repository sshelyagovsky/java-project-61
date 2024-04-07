package hexlet.code;

import java.util.Scanner;
import static hexlet.code.GenerateRandom.*;
public class Even {
    public static void gameEven(String userName, int userChoice) {
        int index = Engine.pickCountRound();
        int ranLowLimit = 1;
        int ranUpLimit = 30;
        int cntCorrectAnswers = 0;
        boolean isCorrect = true;
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

