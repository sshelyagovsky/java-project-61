package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.getRandomNumber;

public class Gcd {
    private static final int COUNT_ROUND = 3;
    private static final int CNT_GAME_PARAM = 2;
    private static final int RAN_LOW_LIMIT = 1;
    private static final int RAN_UP_LIMIT = 30;
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void start() {
        String[][] gameParam = new String[COUNT_ROUND][CNT_GAME_PARAM];

        for (var i = 0; i < COUNT_ROUND; i ++) {
            int value1 = getRandomNumber(RAN_LOW_LIMIT, RAN_UP_LIMIT);
            int value2 = getRandomNumber(RAN_LOW_LIMIT, RAN_UP_LIMIT);

            //game params
            String computerQuestion = value1 + " " + value2;
            int computerAnswer = gcd(value1, value2);

            // set game params
            gameParam[i][0] = computerQuestion;
            gameParam[i][1] = String.valueOf(computerAnswer);
        }
        //transfer game param to Engine
        Engine.startGame(DESCRIPTION, gameParam);
    }
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
}