import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        int secretNumber = 45, userGuess=0, totalGuesses = 0, totalGames = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("PRIYADHARSHINI.M (2024503501) || Week3 Program1");
        System.out.println("Welcome to the Guessing Game! ");
        System.out.println("Try to guess the secret number between 1 and 100. ");
        menuLoop:
        while (true) {
            System.out.println("----Menu----");
            System.out.println("1. Play Game\n2. View Status\n3.Quit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    totalGames++;
                    int Guesses=0;
                    System.out.println("\n Game " + totalGames + " begins!");
                    for(int i=0;i<10;i++) {
                        System.out.print("Attempt " + (totalGuesses + 1) + ": Enter you guess: ");
                        userGuess = sc.nextInt();

                        if (userGuess == -1) {
                            System.out.println("Going to Quit ");
                            break;
                        }
                        if (userGuess < 1 || userGuess > 100) {
                            System.out.println("Invalid user guess. Enter 1-100: ");
                            continue;
                        }
                        Guesses++;
                        i++;
                        if (userGuess < secretNumber)
                            System.out.println("Your Guess is lesser. ");
                        else if (userGuess > secretNumber) {
                            System.out.println("Your Guess is greater. ");
                        } else if (userGuess == secretNumber) {
                            System.out.println("Your Guess is correct! ");
                            break;
                        } else {
                            System.out.println("Sorry, you didn't guess correctly in 10 tries. Starting a new game ");
                        }
                    }
                    totalGuesses +=Guesses;
                    break;
                case 2:
                    if (totalGames == 0) {
                        System.out.println("No Games played yet ");
                    } else {
                        System.out.println("Total Games played: " + totalGames);
                    }
                    System.out.println("Total Guesses made: " + totalGuesses);
                    System.out.printf("Average Guesses per Game: %.2f\n", (double) totalGuesses / totalGames);
                    break;
                case 3:
                    System.out.println("Exiting Game...");
                    break menuLoop;
                default:
                    System.out.println("Invalid choice.");
                    break;

            }
        }
    }
}
