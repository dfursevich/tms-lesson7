package lesson7;

/**
 * @author Dzmitry Fursevich
 */
public class Run {
    public static void main(String[] args) {
        SomeInterface sc = new SomeClass();
        SomeInterface ac = new AnotherClass();

        work(sc);
        work(ac);
    }

    public static void work(SomeInterface some) {
        System.out.println(some.doSomething("hello"));
    }
}
