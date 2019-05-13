
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int sum = 0;


        System.out.println("First: ");
        int lowerNumber = Integer.parseInt(reader.next());

        System.out.println("Last: ");
        int higherNumber =  Integer.parseInt(reader.next());

        while (lowerNumber <= higherNumber) {
            sum += lowerNumber;
            lowerNumber++;
        }
        System.out.println("Sum is " + sum);

    }
}
