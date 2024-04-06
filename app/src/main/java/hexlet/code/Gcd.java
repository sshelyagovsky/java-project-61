package hexlet.code;

import java.util.Scanner;

public class Gcd {
    public static void gameGcd(String userName, int userChoice) {
        int index = Engine.pickCountRound();
        int cntCorrectAnswers = 0;
        boolean isCorrect = true;
        Scanner scanner = new Scanner(System.in);
        Engine.questionTitle(userChoice);
        while (isCorrect && cntCorrectAnswers < index) {
            int value1 = GenerateRandom.getRandomNumber(100);
            int value2 = GenerateRandom.evenRanNum(100, Even.isEven(value1));
            int computeAnswer = gcd(value1, value2);


            Engine.questionMain(String.valueOf(value1 + " " + value2));
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
