package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;
import static hexlet.code.Engine.getRandomNumber;
import static hexlet.code.Engine.getRandomMathOperation;

public class Calc {
    public  static final int INDEX = Engine.pickCountRound();
    public static final int RAN_LOW_LIMIT = 1;
    public static final int RAN_UP_LIMIT = 30;
    public static boolean isCorrect = true;
    public static int cntCorrectAnswers = 0;

    public static void gameCalculator(String userName, int userChoice) {

        Scanner scanner = new Scanner(System.in);

        Engine.questionTitle(userChoice);

        while (isCorrect && cntCorrectAnswers < INDEX) {
            int value1 = getRandomNumber(RAN_LOW_LIMIT, RAN_UP_LIMIT);
            int value2 = getRandomNumber(RAN_LOW_LIMIT, RAN_UP_LIMIT);
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
