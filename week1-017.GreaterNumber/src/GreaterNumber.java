import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the first number: ");
        int number01 = reader.nextInt();

        System.out.println("Type the second number: ");
        int number02 = reader.nextInt();

        if (number01 > number02) {
            System.out.println("Greater number: " + number01);
        } else if (number02 > number01) {
            System.out.println("Greater number: " + number02);
        }else System.out.println("The numbers are equal!");


    }
}
