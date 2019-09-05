
public class Main {

    public static void main(String[] args) {
        // write here test code
        Reformatory testReformatory = new Reformatory();

        Person sauron = new Person("Sauron", 54960, 266, 166);
        Person frodo = new Person("Frodo", 50, 176, 85);

        System.out.println(sauron.getName() + " weight: " + testReformatory.weight(sauron) + " kg");
        System.out.println(frodo.getName() + " weight: " + testReformatory.weight(frodo) + " kg");

        testReformatory.feed(sauron);
        testReformatory.feed(sauron);
        testReformatory.feed(sauron);

        System.out.println("#####################");
        System.out.println("#####################");
        System.out.println("#####################");
        System.out.println("#####################");

        System.out.println(sauron.getName() + " weight: " + testReformatory.weight(sauron) + " kg");
        System.out.println(frodo.getName() + " weight: " + testReformatory.weight(frodo) + " kg");

        testReformatory.weight(sauron);
        System.out.println("total weights measured " + testReformatory.totalWeightsMeasured());


    }
}
