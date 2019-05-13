public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        for (int i=0; i<amount; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1;

        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int white = (height) - 1;
        int star = 1;

        for (int i = 0; i < height; i++) {
            printWhitespaces(white);
            printStars(star);
            white--;
            star += 2;
        }

        for (int i=0; i<2;i++) {
            printWhitespaces(height-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        //System.out.println("---");
        xmasTree(4);
        //System.out.println("---");
        xmasTree(10);
    }
}
