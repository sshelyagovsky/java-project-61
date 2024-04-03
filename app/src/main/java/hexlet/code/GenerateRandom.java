package hexlet.code;

import java.util.Random;
public class GenerateRandom {
    public static int getRandomNumber() {
        // constant: upper limit of random numbers
        int upperLimit = 100;
        Random ran = new Random();
        int randNumber = ran.nextInt(upperLimit);
        return randNumber;
    }
}
