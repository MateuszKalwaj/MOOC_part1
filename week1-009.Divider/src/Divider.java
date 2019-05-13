
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int number01 = reader.nextInt();

        System.out.println("Type another number: ");
        int number02 = reader.nextInt();

        //dzięki takiemu zapisowi mogę zamienić równanie intów na wyników w double
        double division = 1.0 * number01 / number02;

        System.out.println("Division: " + number01 + " / " + number02 + " = " + division);



    }
}
