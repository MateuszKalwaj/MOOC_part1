
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int lastNumber = Integer.parseInt(reader.nextLine());

        int i = firstNumber;

        while (i <= lastNumber ) {
            System.out.println(i);
            i++;
        }
        

        // write your code here

    }
}
