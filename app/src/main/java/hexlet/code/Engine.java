package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static final int GREET_QUEST_NUM = 1;
    public static final int EVEN_QUEST_NUM = 2;
    public static final int CALC_QUEST_NUM = 3;
    public static final int GCD_QUEST_NUM = 4;
    public static final int PROGRESS_QUEST_NUM = 5;
    public static final int PRIME_QUEST_NUM = 6;

    public static int getGames() {
        System.out.println("Please enter the game number and press Enter.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        int number = scanner.nextInt();
        return number;
    }

    public static int pickCountRound() {
        int round = 3;
        return round;
    }
    public static void questionTitle(int userChoice) {
        switch (userChoice) {
            case GREET_QUEST_NUM :
                System.out.println("Welcome to the Brain Games!");
                break;
            case EVEN_QUEST_NUM :
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case CALC_QUEST_NUM :
                System.out.println("What is the result of the expression?");
                break;
            case GCD_QUEST_NUM :
                System.out.println("Find the greatest common divisor of given numbers.");
                break;
            case PROGRESS_QUEST_NUM :
                System.out.println("What number is missing in the progression?");
                break;
            case PRIME_QUEST_NUM :
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                break;
            case 0 :
                break;
            default:
                System.out.println("Incorrect choice");
        }
    }
    public static void questionMain(String compQuestion) {
        System.out.println("Question: " + compQuestion);
    }

    public static void answer() {
        System.out.print("Your answer: ");
    }

    public static boolean checkAnswer(String userAnswer, String computeAnswer) {
        if (userAnswer.equals(computeAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + computeAnswer + "'");
            return false;
        }
    }
    public static void checkCorrectAnswer(boolean isCorrect, String userName) {
        String congratText = "Congratulations";
        String tryAgainText = "Let's try again";
        String text = isCorrect ? congratText : tryAgainText;
        System.out.println(text + ", " + userName + "!");

    }
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
