package lesson7.printer;

/**
 * @author Dzmitry Fursevich
 */
public class Car implements Printable {
    @Override
    public String formatAsString() {
        return "You are printing car";
    }
}
