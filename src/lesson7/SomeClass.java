package lesson7;

/**
 * @author Dzmitry Fursevich
 */
public class SomeClass implements SomeInterface, AnyInterface {
    public String doSomething(String someString) {
        return someString;
    }

    public String doSomethingAgain(String someString) {
        return someString;
    }

    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void doAny() {}
}
