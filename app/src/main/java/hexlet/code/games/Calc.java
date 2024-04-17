package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.getRandomMathOperation;
import static hexlet.code.Utils.getRandomNumber;
public class Calc {
    private  static final int COUNT_ROUND = 3;
    private static final int CNT_GAME_PARAM = 2;
    private static final int RAN_LOW_LIMIT = 1;
    private static final int RAN_UP_LIMIT = 30;
    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void start() {
        String[][] gameParam = new String[COUNT_ROUND][CNT_GAME_PARAM];

        for (var i = 0; i < COUNT_ROUND; i++) {
            int value1 = getRandomNumber(RAN_LOW_LIMIT, RAN_UP_LIMIT);
            int value2 = getRandomNumber(RAN_LOW_LIMIT, RAN_UP_LIMIT);
            String[] operations = {"+", "-", "*"};
            String ranOperation = getRandomMathOperation(operations);

            String computerQuestion = value1 + " " + ranOperation + " " + value2;
            int computerAnswer = calculateResult(value1, value2, ranOperation);

            gameParam[i][0] = computerQuestion;
            gameParam[i][1] = String.valueOf(computerAnswer);
        }
        Engine.startGame(DESCRIPTION, gameParam);
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
            default:
                throw new IllegalStateException("Illegal math operation input");
        }
        return result;
    }
}
