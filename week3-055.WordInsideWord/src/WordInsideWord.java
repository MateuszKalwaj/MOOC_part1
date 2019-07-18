
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.println("Type the first word: ");
        String firstWord = reader.next();

        System.out.println("Type the second word: ");
        String secondWord = reader.next();


        int result = firstWord.indexOf(secondWord);
        if (result >= 0) {
            System.out.println("The word '" + secondWord + "' is found in the word '" + firstWord + "'.");
        }
        else {
            System.out.println("The word '" + secondWord + "' is not found in the word '" + firstWord + "'.");
        }

    }
}
