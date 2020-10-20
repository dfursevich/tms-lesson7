package lesson7.printer;

/**
 * @author Dzmitry Fursevich
 */
public class Book implements Printable {
    private String[] page;

    public Book(String[] page) {
        this.page = page;
    }

    @Override
    public String formatAsString() {
        String result = "";
        for (int i = 0; i < page.length; i++) {
            result = result + page[i] + " ";
        }
        return result;
    }
}
