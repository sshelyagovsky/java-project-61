package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;
import static hexlet.code.Engine.getRandomNumber;

public class Progression {
    public static final int INDEX = Engine.pickCountRound();
    // Progression Length
    public static final int RAN_LOW_LIMIT_LENGTH = 5;
    public static final int RAN_UP_LIMIT_LENGTH = 10;
    //Progression Start
    public static final int RAN_LOW_START_INDX = 1;
    public static final int RAN_UP_START_INDX = 10;
    //Progression Position
    public static final int RAN_LOW_POS_INDEX = 0;
    //Progression Increment index
    public static final int RAN_LOW_INC_INDEX = 5;
    public static final int RAN_UP_INC_INDEX = 10;
    public static int cntCorrectAnswers = 0;
    public static boolean isCorrect = true;

    public static void gameProgression(String userName, int userChoice) {

        Scanner scanner = new Scanner(System.in);

        Engine.questionTitle(userChoice);

        while (isCorrect && cntCorrectAnswers < INDEX) {
            int length = getRandomNumber(RAN_LOW_LIMIT_LENGTH, RAN_UP_LIMIT_LENGTH);
            int startPos = getRandomNumber(RAN_LOW_START_INDX, RAN_UP_START_INDX);
            int position = getRandomNumber(RAN_LOW_POS_INDEX, length - 1);
            int indexInc = getRandomNumber(RAN_LOW_INC_INDEX, RAN_UP_INC_INDEX);

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
