import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int factorial = 1;
        int multi = 1;

        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.next());

        if (number == 0) {
            System.out.println("Factorial is " + factorial);
        } else {
            while (multi <= number) {
                factorial *= multi;
                multi ++;
            }
        }
        System.out.println("Factorial is " + factorial);
    }
}
