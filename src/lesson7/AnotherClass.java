package lesson7;

/**
 * @author Dzmitry Fursevich
 */
public class AnotherClass implements SomeInterface {
    @Override
    public String doSomething(String someString) {
        return someString + "+1" ;
    }

    @Override
    public String doSomethingAgain(String someString) {
        return someString + "+1";
    }
}
