package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.getRandomNumber;

public class Prime {
    private static final int  COUNT_ROUND = 3;
    private static final int CNT_GAME_PARAM = 2;
    private static final int RAN_LOW_LIMIT = 2;
    private static final int RAN_UP_LIMIT = 30;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {

        String[][] gameParam = new String[COUNT_ROUND][CNT_GAME_PARAM];

        for (var i = 0; i < COUNT_ROUND; i++) {
            int generatedNumber = getRandomNumber(RAN_LOW_LIMIT, RAN_UP_LIMIT);

            //game params
            String computerQuestion = String.valueOf(generatedNumber);
            String computerAnswer = isPrimeNumber(generatedNumber) ? "yes" : "no";

            //set game param
            gameParam[i][0] = computerQuestion;
            gameParam[i][1] = computerAnswer;
        }
        //transfer game param to Engine
        Engine.startGame(DESCRIPTION, gameParam);
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
