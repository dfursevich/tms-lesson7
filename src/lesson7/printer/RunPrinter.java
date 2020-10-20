package lesson7.printer;

/**
 * @author Dzmitry Fursevich
 */
public class RunPrinter {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Car car = new Car();
        Book book = new Book(new String[] {"page1", "page2"});
        Magazine magazine = new Magazine("magazine page");

        printer.print(car);
        printer.print(book);
        printer.print(magazine);

    }
}
