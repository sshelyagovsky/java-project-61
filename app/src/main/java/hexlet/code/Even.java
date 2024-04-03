package hexlet.code;

import java.util.Objects;
import java.util.Scanner;

public class Even {
    public static void question(String userName) {
        int index = 3;
        int cntCorrectAnswers = 0;
        boolean isCorrect = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (isCorrect && cntCorrectAnswers < index) {
            int generatedNumber = GenerateRandom.getRandomNumber();
            String computeAnswer = isEven(generatedNumber) ? "yes" : "no";
                System.out.println("Question: " + generatedNumber);
                System.out.print("Your answer: ");
                var userAnswer = scanner.nextLine();
                isCorrect = checkAnswer(userAnswer, computeAnswer);
                cntCorrectAnswers++;
            }
        checkCorrectAnswer(cntCorrectAnswers, userName);
        }
    public static boolean isEven(int number) {
        return number % 2 == 0;
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
    public static void checkCorrectAnswer(int cnt, String userName) {
            String congratText = "Congratulations";
            String tryAgainText = "Let's try again";
            String text = cnt == 3 ? congratText : tryAgainText;
            System.out.println(text + ", " + userName+ "!");

        }
}

