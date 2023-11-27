import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        String menuInput;
        System.out.printf("Hello and welcome!");

        System.out.printf("Welcome to WHO WANTS TO BE A MILLIONAIRE!");

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.printf("Select an option!\n");
            System.out.printf("- Press S to start the game!\n");
            System.out.printf("- Press R to check the rules!\n");
            System.out.printf("- Press Q to exit the game.\n");
            menuInput = scan.nextLine();

            // quits app if Q is input
            if (menuInput.equals("Q")) {
                System.out.println("yea quit");
                break;
            } else if (menuInput.equals("R")) {
                // enter code for outputting the rules of the game
                System.out.println("R");
            } else if (menuInput.equals("S")) {
                // start the game here
                System.out.println("S");
            } else {
                System.out.println("That is not a valid option. Please try again.");
            }

        }
    }
}