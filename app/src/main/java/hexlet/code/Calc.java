package hexlet.code;

import java.util.Scanner;
import static hexlet.code.GenerateRandom.getRandomNumber;
import static hexlet.code.GenerateRandom.getRandomMathOperation;
public class Calc {
    private static int index = Engine.pickCountRound();
    private static int cntCorrectAnswers = 0;
    private static int ranLowLimit = 1;
    private static int ranUpLimit = 30;
    private static boolean isCorrect = true;

    public static void gameCalculator(String userName, int userChoice) {

        Scanner scanner = new Scanner(System.in);

        Engine.questionTitle(userChoice);

        while (isCorrect && cntCorrectAnswers < index) {
            int value1 = getRandomNumber(ranLowLimit, ranUpLimit);
            int value2 = getRandomNumber(ranLowLimit, ranUpLimit);
            String[] operations = {"+", "-", "*"};
            String ranOperation = getRandomMathOperation(operations);

            int computeAnswer = calculateResult(value1, value2, ranOperation);

            Engine.questionMain(value1 + " " + ranOperation + " " + value2);
            Engine.answer();
            var userAnswer = scanner.nextInt();

            isCorrect = Engine.checkAnswer(String.valueOf(userAnswer), String.valueOf(computeAnswer));
            cntCorrectAnswers++;
        }
        Engine.checkCorrectAnswer(isCorrect, userName);
    }
    public static int calculateResult(int value1, int value2, String operation) {
        int result = 0;
        switch (operation) {
            case "+" :
                result = value1 + value2;
                break;
            case "-" :
                result = value1 - value2;
                break;
            case "*" :
                result = value1 * value2;
                break;
            case "/" :
                result = value1 / value2;
                break;
            default:
                result = 0;
        }
        return result;
    }
}
