
public class Main {

    public static void main(String[] args) {
        // write testcode here
        MyDate first = new MyDate(9, 9, 2019);
        MyDate second = new MyDate(1, 1, 2020);
        MyDate third = new MyDate(25, 12, 2010);

        System.out.println( second + " and " + first + " difference in years: " + second.differenceInYears(first) );

        System.out.println( third + " and " + first + " difference in years: " + third.differenceInYears(first) );

        System.out.println( second + " and " + third + " difference in years: " + second.differenceInYears(third) );
    }
}
