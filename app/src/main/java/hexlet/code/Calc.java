package hexlet.code;

import java.util.Scanner;

public class Calc {
    public static void gameCalculator(String userName, int userChoice) {
        int index = 3;
        int cntCorrectAnswers = 0;
        boolean isCorrect = true;
        Scanner scanner = new Scanner(System.in);
        Engine.questionTitle(userChoice);
        while (isCorrect && cntCorrectAnswers < index) {
            int value1 = GenerateRandom.getRandomNumber(100);
            int value2 = GenerateRandom.getRandomNumber(100);
            String[] operations = {"+", "-", "*", "/"};
            String ranOperation = GenerateRandom.getRandomMathOperation(operations);

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
