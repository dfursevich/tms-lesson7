package lesson7.button;

/**
 * @author Dzmitry Fursevich
 */
public class RunButton {
    public static void main(String[] args) {
        SendEmail se = new SendEmail();
        Button button = new Button(se);
        button.click();
    }
}
