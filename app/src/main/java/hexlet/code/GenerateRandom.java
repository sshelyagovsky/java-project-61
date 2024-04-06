package hexlet.code;

import java.util.Random;
public class GenerateRandom {
    public static int getRandomNumber(int upperLimit) {
        // constant: upper limit of random numbers
        Random ran = new Random();
        int randNumber = ran.nextInt(upperLimit);
        return randNumber;
    }
    public static int getRandomNumberExt(int lowerLimit, int upperLimit) {
        // constant: upper limit of random numbers
        Random ran = new Random();
        int randNumber = 0;
        randNumber = ran.nextInt(lowerLimit, upperLimit);
        return randNumber;
    }
    public static String getRandomMathOperation(String[] operations) {
        int index = getRandomNumber(operations.length);
        return operations[index];
    }
    public static int evenRanNum(int upperLimit, boolean isEven) {
        int randNumber = 0;

        while (isEven) {
            Random ran = new Random();
            randNumber = ran.nextInt(upperLimit);
        }
        return randNumber;
    }
}
