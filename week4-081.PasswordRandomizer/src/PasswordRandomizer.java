import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    int lenght;
    Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.lenght = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        for (int i = 0; i < lenght; i++) {
            password += (char)(random.nextInt(26) + 'a');
        }
        return password;
    }
}
