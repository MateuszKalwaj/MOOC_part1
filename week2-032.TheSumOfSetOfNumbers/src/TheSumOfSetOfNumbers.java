
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what?");
        int untilNumber = Integer.parseInt(reader.next());

        int sum = 0;
        int i = 0;

        while (i <= untilNumber) {
            sum = sum + i;
            i++;
            System.out.println("int i: " + i);
            System.out.println("int sum: " + sum);
        }
        System.out.println("sum is " + sum);

    }
}
