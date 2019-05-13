
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");

        int number = Integer.parseInt(reader.next());
        int sum = 0;
        int i = 0;
        int base = 2;


        while (i <= number) {
            sum += Math.pow(base,i);
            i ++;
        }
        System.out.println("The result is " + sum);
    }
}
