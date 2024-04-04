package hexlet.code;

import java.util.Random;
public class GenerateRandom {
    public static int getRandomNumber(int upperLimit) {
        // constant: upper limit of random numbers
        Random ran = new Random();
        int randNumber = ran.nextInt(upperLimit);
        return randNumber;
    }
    public static String getRandomMathOperation(String[] operations) {
        int index = getRandomNumber(operations.length - 1);
        return operations[index];
    }
}
