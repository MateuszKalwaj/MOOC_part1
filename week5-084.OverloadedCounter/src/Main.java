public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter testCount = new Counter(67, false);
        testCount.increase();
        testCount.increase(602);
        testCount.decrease(4);
        System.out.println(testCount.value());
    }
}
