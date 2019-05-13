
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String user1 = "alex";
        String user2 = "emily";
        String validPasswordAlex = "mightyducks";
        String validPasswordEmily = "cat";

        System.out.println("Type your username: ");
        String username = userInput.nextLine();
        System.out.println("Type your password: ");
        String password = userInput.nextLine();

        if (username.equals(user1) && password.equals(validPasswordAlex)) {
            System.out.println("You are now logged into the system!");

        } else if (username.equals(user2) && password.equals(validPasswordEmily)) {
            System.out.println("You are now logged into the system!");
        } else System.out.println("Your username or password was invalid!");

    }
}
