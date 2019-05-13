
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Type the points [0-60]: ");
        int t = userInput.nextInt();
        if (t > 60 || t < 0) {
            System.out.println("Enter the correct value");
        } else if (t > 0 && t <= 29 ) {
            System.out.println("failed");
        } else if (t >= 30 && t <= 34) {
            System.out.println("1");
        } else if (t >= 35 && t <= 39) {
            System.out.println("2");
        } else if (t >= 40 && t <=44) {
            System.out.println("3");
        } else if (t >= 45 && t <= 49) {
            System.out.println("4");
        } else if (t >= 50 && t <= 60) {
            System.out.println("5");
        }

    }
}

