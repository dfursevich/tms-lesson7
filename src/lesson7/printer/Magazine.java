package lesson7.printer;

/**
 * @author Dzmitry Fursevich
 */
public class Magazine implements Printable {
    private String text;

    public Magazine(String text) {
        this.text = text;
    }

    @Override
    public String formatAsString() {
        return text;
    }
}
