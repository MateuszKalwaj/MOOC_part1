
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = Integer.parseInt(userInput.nextLine()); //taki zapis powoduje szybszą kompilację w dużych pętlach
        if (age < 0 || age > 120) {
            System.out.println("Impossible!");
        } else if (age >= 0 && age <= 120) {
            System.out.println("OK");
        }

    }
}
