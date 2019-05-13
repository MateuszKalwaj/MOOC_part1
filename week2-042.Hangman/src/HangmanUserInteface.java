
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");

        // PROGRAM YOUR SOLUTION HERE

        while (hangman.gameOn()) {
            String userInput = reader.nextLine();
            if (userInput.equals("quit")) {
                break;
            }
            if (userInput.equals("status")) {
                hangman.printStatus();
            }
            if (userInput.isEmpty()) {
                printMenu();
            }
            if (userInput.length() == 1) { //ten zapis powoduje, że zakładamy warunek na dokładnie jeden znak użytkownika
                hangman.guess(userInput);
            }
            hangman.printMan();
            hangman.printWord();
        }


        System.out.println("Thank you for playing!");
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");
    }
}
