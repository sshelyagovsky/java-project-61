package hexlet.code.games;

import hexlet.code.Engine;
import static hexlet.code.Utils.getRandomNumber;

public class Even {
    private static final int COUNT_ROUND = 3;
    private static final int CNT_GAME_PARAM = 2;
    private static final int RAN_LOW_LIMIT = 1;
    private static final int RAN_UP_LIMIT = 30;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() {

        String[][] gameParam = new String[COUNT_ROUND][CNT_GAME_PARAM];

        for (var i = 0; i < COUNT_ROUND; i ++) {
            //game params
            var computerQuestion = getRandomNumber(RAN_LOW_LIMIT, RAN_UP_LIMIT);
            var computerAnswer = isEven(computerQuestion) ? "yes" : "no";

            //set game param
            gameParam[i][0] = String.valueOf(computerQuestion);
            gameParam[i][1] = computerAnswer;
        }
        //transfer game param to Engine
        Engine.startGame(DESCRIPTION, gameParam);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

