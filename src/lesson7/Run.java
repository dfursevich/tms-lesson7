package lesson7;

/**
 * @author Dzmitry Fursevich
 */
public class Run {
    public static void main(String[] args) {
        SomeInterface sc = new SomeClass();
        SomeInterface ac = new AnotherClass();

        test(sc);
        test(ac);
    }

    public static void work(SomeInterface some) {
        System.out.println(some.doSomething("hello"));
    }

    public static void test(SomeInterface some) {
        System.out.println(some instanceof SomeClass);
        System.out.println(some.getClass());

        if (some instanceof SomeClass) {
            ((SomeClass) some).print();
        }
    }
}
