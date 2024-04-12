package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.getRandomNumber;

public class Progression {
    private static final int COUNT_ROUND = 3;
    private static final int CNT_GAME_PARAM = 2;

    // Progression Length
    private static final int RAN_LOW_LIMIT_LENGTH = 5;
    private static final int RAN_UP_LIMIT_LENGTH = 10;

    //Progression Start
    private static final int RAN_LOW_START_INDEX = 1;
    private static final int RAN_UP_START_INDEX = 10;

    //Progression Position
    private static final int RAN_LOW_POS_INDEX = 0;

    //Progression Increment index
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

            int[] progression = getProgression(length, startPos, indexInc);

            //game params
            String computerQuestion = getHideStrProgression(progression, position);
            int computerAnswer = getHiddenValueProgression(progression, position);

            // set game params
            gameParam[i][0] = computerQuestion;
            gameParam[i][1] = String.valueOf(computerAnswer);
        }
        //transfer game param to Engine
        Engine.startGame(DESCRIPTION, gameParam);
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
        int poseIndex = position == 0 ? position : position - 1;
        for (int i = 0; i < lenProgression; i++) {
            if (i == poseIndex) {
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
