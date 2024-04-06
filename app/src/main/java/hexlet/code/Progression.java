package hexlet.code;

import java.util.Arrays;
import java.util.Scanner;

public class Progression {

    public static void gameProgression(String userName, int userChoice) {
        int index = Engine.pickCountRound();
        int cntCorrectAnswers = 0;
        int lowerLimitRandom = 5;
        boolean isCorrect = true;
        Scanner scanner = new Scanner(System.in);
        while (isCorrect && cntCorrectAnswers < index) {
            int lengthProgression = GenerateRandom.getRandomNumberExt(lowerLimitRandom, 10);
            int startProgression = GenerateRandom.getRandomNumber( 10);
            int positionProgression = GenerateRandom.getRandomNumberExt(1, lengthProgression);
            int indexIncProgression = GenerateRandom.getRandomNumberExt(lowerLimitRandom, 10);
            int[] progression = getProgression(lengthProgression, startProgression, indexIncProgression);
            String questionStrProgression = getHideStrProgression(progression, positionProgression);
            int computeAnswer = getHiddenValueProgression(progression, positionProgression);

            Engine.questionMain(questionStrProgression);
            Engine.answer();

            String userAnswer = scanner.nextLine();
            isCorrect = Engine.checkAnswer(String.valueOf(userAnswer), String.valueOf(computeAnswer));
            cntCorrectAnswers++;
        }
    }
    public static int[] getProgression(int lengthProgression, int startProgression, int indexIncProgression) {
        int[] numbers = new int[lengthProgression];
        for (int i = 0; i < lengthProgression; i++) {
            numbers[i] = (i == 0) ? startProgression : numbers[i - 1] + indexIncProgression;
        }
        return numbers;
    }
    public static String getHideStrProgression(int[] progression, int positionProgression) {
        int lenProgression = progression.length;
        StringBuilder hideProgression = new StringBuilder();
        for (int i = 0; i < lenProgression; i++) {
            if (i == positionProgression - 1) {
                hideProgression.append(".. ");
            } else {
                hideProgression.append(progression[i]).append(" ");
            }
        }
        return hideProgression.toString();
    }
    public static int getHiddenValueProgression(int[] progression, int positionProgression) {
        return progression[positionProgression -1];
    }
}
