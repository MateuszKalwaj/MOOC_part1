
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number01 = reader.nextInt();

        System.out.println("Type another number: ");
        int number02 = reader.nextInt();

        System.out.println("The bigger number of the two numbers given was: " + Math.max(number01, number02));
    }
}
