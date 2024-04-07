package hexlet.code;

import java.util.Scanner;

import static hexlet.code.GenerateRandom.getRandomNumber;
public class Progression {
    private static int index = Engine.pickCountRound();
    private static int cntCorrectAnswers = 0;
    private static boolean isCorrect = true;
    // Progression Length
    private static int ranLowLimitLength = 5;
    private static int ranUpLimitLength = 10;
    //Progression Start
    private static int ranLowStartIndx = 1;
    private static int ranUpStartIndx = 10;
    //Progression Position
    private static int ranLowPosIndex = 0;
    //Progression Increment index
    private static int ranLowIncIndex = 5;
    private static int ranUpIncIndex = 10;

    public static void gameProgression(String userName, int userChoice) {

        Scanner scanner = new Scanner(System.in);

        Engine.questionTitle(userChoice);

        while (isCorrect && cntCorrectAnswers < index) {
            int length = getRandomNumber(ranLowLimitLength, ranUpLimitLength);
            int startPos = getRandomNumber(ranLowStartIndx, ranUpStartIndx);
            int position = getRandomNumber(ranLowPosIndex, length - 1);
            int indexInc = getRandomNumber(ranLowIncIndex, ranUpIncIndex);

            int[] progression = getProgression(length, startPos, indexInc);
            String questionStrProgression = getHideStrProgression(progression, position);
            int computeAnswer = getHiddenValueProgression(progression, position);

            Engine.questionMain(questionStrProgression);
            Engine.answer();

            String userAnswer = scanner.nextLine();
            isCorrect = Engine.checkAnswer(String.valueOf(userAnswer), String.valueOf(computeAnswer));
            cntCorrectAnswers++;
        }
        Engine.checkCorrectAnswer(isCorrect, userName);
    }
    public static int[] getProgression(int lengthProgression, int startProgression, int indexInc) {
        int[] numbers = new int[lengthProgression];
        for (int i = 0; i < lengthProgression; i++) {
            numbers[i] = (i == 0) ? startProgression : numbers[i - 1] + indexInc;
        }
        return numbers;
    }
    public static String getHideStrProgression(int[] progression, int position) {
        int lenProgression = progression.length;
        StringBuilder hideProgression = new StringBuilder();
        int posIndx = position == 0 ? position : position - 1;
        for (int i = 0; i < lenProgression; i++) {
            if (i == posIndx) {
                hideProgression.append(".. ");
            } else {
                hideProgression.append(progression[i]).append(" ");
            }
        }
        return hideProgression.toString();
    }
    public static int getHiddenValueProgression(int[] progression, int position) {

        return position == 0 ? progression[position] : progression[position - 1];
    }
}
