
import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "1. Which language runs on the JVM?",
            "2. Which keyword creates an object?",
            "3. Which data type stores true or false?",
            "4. Which symbol ends a Java statement?",
            "5. Which method starts a Java program?"
        };

        String[][] options = {
            {"A. HTML", "B. Java", "C. CSS", "D. SQL"},
            {"A. new", "B. make", "C. create", "D. object"},
            {"A. int", "B. char", "C. boolean", "D. String"},
            {"A. :", "B. ,", "C. .", "D. ;"},
            {"A. start()", "B. main()", "C. run()", "D. begin()"}
        };

        char[] answers = {'B', 'A', 'C', 'D', 'B'};
        int score = 0;

        System.out.println("===== JAVA QUIZ =====");
        System.out.println("Choose A, B, C, or D.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer: ");
            String input = sc.nextLine().trim();

            if (input.length() == 1 &&
                Character.toUpperCase(input.charAt(0)) == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println(
                    "Incorrect! Correct answer: " + answers[i] + "\n"
                );
            }
        }

        double percentage =
            (score * 100.0) / questions.length;

        System.out.println("===== FINAL RESULT =====");
        System.out.println("Score: " + score + "/" + questions.length);
        System.out.printf("Percentage: %.2f%%%n", percentage);

        if (score >= 4) {
            System.out.println("Excellent work!");
        } else if (score >= 3) {
            System.out.println("Good job! Keep practicing.");
        } else {
            System.out.println("Practice more and try again.");
        }

        sc.close();
    }
}
