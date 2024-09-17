package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2018"); // Change these as you need
        remindName();
        guessAge();
        count();
        test();  // Call to the test method
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }
    
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        
        System.out.println("Which of the following statements correctly creates and initializes an array of integers in Java?");
        
        System.out.println("1. int[] numbers = {1, 2, 3, 4, 5};");
        System.out.println("2. int[] numbers = new int[]{1, 2, 3, 4, 5, 6};");
        System.out.println("3. int[] numbers = new int[5]{1, 2, 3, 4, 5};");
        System.out.println("4. int numbers() = {1, 2, 3, 4, 5};");

        while (true) {
            System.out.print("Enter your choice (e.g., 12 for multiple correct choices): ");
            String choices = scanner.next();

            boolean correctOne = choices.contains("1");
            // These will be used if you want to check for multiple correct answers
            boolean incorrectTwo = choices.contains("2");
            boolean incorrectThree = choices.contains("3");
            boolean incorrectFour = choices.contains("4");

            // Check if both correct answers are selected and no wrong answer is chosen
            if (correctOne == true) {
                System.out.println("Congratulations, you're right!");
                break; // Exit the loop when the correct answer is provided
            } else {
                System.out.println("Please, try again.");
            }
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
