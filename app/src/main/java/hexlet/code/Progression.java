package hexlet.code;

import java.util.Scanner;

import static hexlet.code.GenerateRandom.*;
public class Progression {

    public static void gameProgression(String userName, int userChoice) {
        int index = Engine.pickCountRound();
        int cntCorrectAnswers = 0;
        boolean isCorrect = true;
        // Progression Length
        int ranLowLimitLength = 5;
        int ranUpLimitLength = 10;
        //Progression Start
        int ranLowStartIndx = 1;
        int ranUpStartIndx = 10;
        //Progression Position
        int ranLowPosIndex = 0;

        //Progression Increment index
        int ranLowIncIndex = 5;
        int ranUpIncIndex = 10;

        Scanner scanner = new Scanner(System.in);

        Engine.questionTitle(userChoice);

        while (isCorrect && cntCorrectAnswers < index) {
            int length = getRandomNumber(ranLowLimitLength, ranUpLimitLength);
            int startPos = getRandomNumber(ranLowStartIndx, ranUpStartIndx);
            int position = getRandomNumber(ranLowPosIndex, ranUpLimitLength - 1);
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
        for (int i = 0; i < lenProgression; i++) {
            if (i == position - 1) {
                hideProgression.append(".. ");
            } else {
                hideProgression.append(progression[i]).append(" ");
            }
        }
        return hideProgression.toString();
    }
    public static int getHiddenValueProgression(int[] progression, int position) {
        return progression[position - 1];
    }
}
