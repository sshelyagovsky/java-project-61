package hexlet.code;

import java.util.Objects;
import java.util.Scanner;

public class Even {
    public static void questionEven(String userName, int userChoice) {
        int index = Engine.pickCountRound();
        int cntCorrectAnswers = 0;
        boolean isCorrect = true;
        Scanner scanner = new Scanner(System.in);

        while (isCorrect && cntCorrectAnswers < index) {
            int generatedNumber = GenerateRandom.getRandomNumber(100);
            String computeAnswer = isEven(generatedNumber) ? "yes" : "no";

            Engine.questionTitle(userChoice);
            Engine.questionMain(String.valueOf(generatedNumber));
            Engine.answer();

            String userAnswer = scanner.nextLine();
            isCorrect = Engine.checkAnswer(userAnswer, computeAnswer);
            cntCorrectAnswers++;
        }
        Engine.checkCorrectAnswer(cntCorrectAnswers, userName);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }


}

