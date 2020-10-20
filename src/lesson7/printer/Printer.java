package lesson7.printer;

/**
 * @author Dzmitry Fursevich
 */
public class Printer {
    public void print(Printable obj) {
        System.out.println(obj.formatAsString());
    }
}
