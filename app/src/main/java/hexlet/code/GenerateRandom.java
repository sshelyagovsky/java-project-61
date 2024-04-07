package hexlet.code;

import java.util.Random;

public class GenerateRandom {
    public static int getRandomNumber(int lowerLimit, int upperLimit) {
        // constant: lowerLimit of random numbers
        // constant: upperLimit of random numbers
        Random ran = new Random();
        return ran.nextInt(lowerLimit, upperLimit);
    }
    public static String getRandomMathOperation(String[] operations) {
        int index = getRandomNumber(0, operations.length);
        return operations[index];
    }
}
