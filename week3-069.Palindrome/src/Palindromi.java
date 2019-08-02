import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here

        String reversedText = "";
        int num = 0;

        while (num < text.length()) {
            int backNumber = ((text.length() - 1) - num);
            reversedText += text.charAt(backNumber);
            num++;
        }
        if (text.equals(reversedText)) {

            return true;
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
