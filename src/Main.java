import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!\nI'm thinking of a number between 1 and 100.");
        System.out.println("Please select the difficulty level");
        System.out.println("1 - Easy (10 chances)");
        System.out.println("2 - Medium (5 chances)");
        System.out.println("3 - Hard (3 chances)");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        int randomNumber;
        int attempts = 0;
        boolean guessed = false;

        switch (choice) {
            case 1:
                System.out.println("Great! You've selected the Easy difficulty level.\nLet's start the game!");
                randomNumber = (int) (Math.random() * 100) + 1;
                for (int i = 10; i > 0; i--) {
                    attempts++;
                    System.out.print("Enter your guess: ");
                    int guess = scanner.nextInt();
                    if (guess > randomNumber) {
                        System.out.println("Incorrect! The number is less than " + guess);
                    } else if (guess < randomNumber) {
                        System.out.println("Incorrect! The number is greater than " + guess);
                    } else {
                        System.out.println("Congratulations! You guessed the right number in " + attempts + " attempts.");
                        guessed = true;
                        break;
                    }
                }
                if(!guessed) {
                    System.out.println("You've run out of attempts!\nThe correct number was " + randomNumber);
                }
                break;
            case 2:
                System.out.println("Great! You've selected the Medium difficulty level.\nLet's start the game!");
                randomNumber = (int) (Math.random() * 100) + 1;
                for (int i = 5; i > 0; i--) {
                    attempts++;
                    System.out.print("Enter your guess: ");
                    int guess = scanner.nextInt();
                    if (guess > randomNumber) {
                        System.out.println("Incorrect! The number is less than " + guess);
                    } else if (guess < randomNumber) {
                        System.out.println("Incorrect! The number is greater than " + guess);
                    } else {
                        System.out.println("Congratulations! You guessed the right number in " + attempts + " attempts.");
                        guessed = true;
                        break;
                    }
                }

                if(!guessed) {
                    System.out.println("You've run out of attempts!\nThe correct number was " + randomNumber);
                }
                break;
            case 3:
                System.out.println("Great! You've selected the Hard difficulty level.\nLet's start the game!");
                randomNumber = (int) (Math.random() * 100) + 1;
                for (int i = 3; i > 0; i--) {
                    attempts++;
                    System.out.print("Enter your guess: ");
                    int guess = scanner.nextInt();
                    if (guess > randomNumber) {
                        System.out.println("Incorrect! The number is less than " + guess);
                    } else if (guess < randomNumber) {
                        System.out.println("Incorrect! The number is greater than " + guess);
                    } else {
                        System.out.println("Congratulations! You guessed the right number in " + attempts + " attempts.");
                        guessed = true;
                        break;
                    }
                }
                if(!guessed) {
                    System.out.println("You've run out of attempts!\nThe correct number was " + randomNumber);
                }
                break;
            default:
                System.out.println("Scelta non valida");
        }
    }
}