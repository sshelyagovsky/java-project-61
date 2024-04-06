package hexlet.code;

public class Engine {
    public static int pickCountRound() {
        int round = 3;
        return round;
    }
    public static void questionTitle(int userChoice) {
        switch (userChoice) {
            case 1 :
                System.out.println("Welcome to the Brain Games!");
                break;
            case 2 :
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case 3 :
                System.out.println("What is the result of the expression?");
                break;
            case 4 :
                System.out.println("Find the greatest common divisor of given numbers.");
                break;
            case 5 :
                System.out.println("What number is missing in the progression?");
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
}
