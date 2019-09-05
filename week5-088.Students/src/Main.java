
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.equals("")) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentnumber = reader.nextLine();

            students.add(new Student(name, studentnumber));
        }

        System.out.println(students);

        System.out.println("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");
        for (Student student : students) {
            if (student.getName().contains(searchTerm)){
                System.out.println(student);
            }
        }
    }
}
