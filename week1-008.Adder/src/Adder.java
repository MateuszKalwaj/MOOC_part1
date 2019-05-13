
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number:");
        int number01 = reader.nextInt();

        System.out.println("Type another number:");

        int number02 = reader.nextInt();

        int sum = number01 + number02;

        System.out.println("Sum of the numbers: " + sum);

        // Implement your program here. Remember to ask the input from user
    }
}
