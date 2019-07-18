import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.next();

        System.out.println("Length of the end part: ");
        int endPart = reader.nextInt();

        System.out.println("Result: " + word.substring((word.length()-endPart)) );

    }
}
