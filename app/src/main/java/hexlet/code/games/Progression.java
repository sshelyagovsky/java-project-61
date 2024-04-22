package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

import static hexlet.code.Utils.getRandomNumber;

public class Progression {
    private static final int COUNT_ROUND = Engine.getCountRound();
    private static final int CNT_GAME_PARAM = 2;
    private static final int RAN_LOW_LIMIT_LENGTH = 5;
    private static final int RAN_UP_LIMIT_LENGTH = 10;
    private static final int RAN_LOW_START_INDEX = 1;
    private static final int RAN_UP_START_INDEX = 10;
    private static final int RAN_LOW_POS_INDEX = 0;
    private static final int RAN_LOW_INC_INDEX = 5;
    private static final int RAN_UP_INC_INDEX = 10;
    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void start() {
        String[][] gameParam = new String[COUNT_ROUND][CNT_GAME_PARAM];

        for (var i = 0; i < COUNT_ROUND; i++) {
            int length = getRandomNumber(RAN_LOW_LIMIT_LENGTH, RAN_UP_LIMIT_LENGTH);
            int startPos = getRandomNumber(RAN_LOW_START_INDEX, RAN_UP_START_INDEX);
            int position = getRandomNumber(RAN_LOW_POS_INDEX, length - 1);
            int indexInc = getRandomNumber(RAN_LOW_INC_INDEX, RAN_UP_INC_INDEX);

            String[] progression = getProgression(length, startPos, indexInc);
            String[] hideProgression = Arrays.copyOfRange(progression, 0, progression.length);
            hideProgression[position] = "..";

            String computerQuestion = String.join(" ", hideProgression);
            String computerAnswer = progression[position];

            gameParam[i][0] = computerQuestion;
            gameParam[i][1] = String.valueOf(computerAnswer);
        }
        Engine.startGame(DESCRIPTION, gameParam);
    }
    public static String[] getProgression(int lengthProgression, int startProgression, int indexInc) {
        String[] numbers = new String[lengthProgression];
        for (int i = 0; i < lengthProgression; i++) {
            var incValueProgression = startProgression + i * indexInc;
            numbers[i] = String.valueOf(incValueProgression);
        }
        return numbers;
    }
}
