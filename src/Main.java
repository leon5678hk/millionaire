import java.util.Scanner;

public class Main {

    // indicating what round;
    int roundNo = 1;
    // arrays for round earned money
    int[] rOneEasy = {100, 500, 1000};
    int[] rTwoEasy = {8000, 16000, 32000};
    int[] rThreeEasy = {125000, 500000, 1000000};
    int[] rOneHard = {100, 200, 300, 500, 1000};
    int[] rTwoHard = {2000, 4000, 8000, 16000, 32000};
    int[] rThreeHard = {64000, 125000, 250000, 500000, 1000000};

    public Main() {

    }

    public void roundStart() {

    }

    // obtain difficulty
    public String difficulty (Scanner userInput) {

        String difficulty;
        System.out.println("What difficulty do you want to play on? Enter E for easy mode, and H for hard mode.");
        while(true) {
            difficulty = userInput.nextLine();
            if (difficulty.equals("E") || difficulty.equals("H")) {
                break;
            } else {
                System.out.println("Unable to set difficulty based on input. Please try again!");
            }
        }
        return difficulty;

    }

    // prints game rules
    public void printRules() {
        System.out.println("\nGeneral rules are as follows:");
        System.out.println("There will be 3 rounds, and each round has 3 questions for Easy difficulty, and 5 for Hard.");
        System.out.println("At the end of the rounds, you can win $1,000, $32,000, $1,000,000 respectively.");
        System.out.println("You may choose to leave after any round and take the corresponding amount of winnings with you; leaving mid round is not allowed.");
        System.out.println("You will get three lifelines:");
        System.out.println("- 50/50, which eliminates 2 incorrect answers;");
        System.out.println("- Ask the audience, in which you’ll be given multiple audience responses and you will have to decide which one is the correct answer;");
        System.out.println("- Phone a friend, in which you will be given one hint related to the correct answer.");
        System.out.println("You will lose all your winning if there is a single incorrect answer and the game will end.\n");

    }
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Main main = new Main();

        String menuInput;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to WHO WANTS TO BE A MILLIONAIRE!");

        while (true) {
            System.out.println("Select an option!");
            System.out.println("- Press S to start the game!");
            System.out.println("- Press R to check the rules!");
            System.out.println("- Press Q to exit the game.");
            menuInput = userInput.nextLine();

            // quits app if Q is input
            if (menuInput.equals("Q")) {            // displays thank you msg and exits
                System.out.println("Thank you for playing!");
                break;
            } else if (menuInput.equals("R")) {     // enter code for outputting the rules of the game
                main.printRules();
            } else if (menuInput.equals("S")) {     // start the game here

                System.out.println("Game will start now!");

                String diff = main.difficulty(userInput); //obtain userInput for difficulty
                int rounds;
                if (diff.equals("E")) {
                    rounds = 3;
                } else {
                    rounds = 5;
                }

                // round 1

                // round 2

                // round 3

            } else { // error handling for incorrect user input
                System.out.println("That is not a valid option. Please try again.");
            }

        }
    }
}