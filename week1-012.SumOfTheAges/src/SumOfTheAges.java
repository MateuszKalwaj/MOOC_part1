
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name01 = reader.next();

        System.out.println("Type your age: ");
        int age01 = reader.nextInt();

        System.out.println("Type your name: ");
        String name02 = reader.next();

        System.out.println("Type your age: ");
        int age02 = reader.nextInt();

        int sum = age01 + age02;

        System.out.println(name01 + " and " + name02 + " are " + sum + " years old in total");

    }
}
