
import java.util.Scanner;


public class SumOfManyNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int read = Integer.parseInt(reader.nextLine());

            /* sum = sum + read;
            easier way: */
            sum += read;

            System.out.println("Sum now: " + sum);
            if (read == 0) {
                break;
            }
            // do something here
        }
        System.out.println("Sum in the end: " + sum);
    }
}
