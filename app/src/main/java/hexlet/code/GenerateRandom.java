package hexlet.code;

import java.util.Random;

public class GenerateRandom {
    public static int getRandomNumber(int lowerLimit, int upperLimit) {
        // constant: lowerLimit of random numbers
        // constant: upperLimit of random numbers
        Random ran = new Random();
        int randNumber = ran.nextInt(lowerLimit, upperLimit);
        return randNumber;
    }
    public static String getRandomMathOperation(String[] operations) {
        int index = getRandomNumber(0, operations.length);
        return operations[index];
    }
    public static int evenRanNum(int upperLimit) {
        int randNumber = 0;
        Random ran = new Random();
        randNumber = ran.nextInt(upperLimit);
        return randNumber;
    }
}
