package lesson7.button;

/**
 * @author Dzmitry Fursevich
 */
public class Button {
    private ClickHandler clickHandler;

    public Button(ClickHandler clickHandler) {
        this.clickHandler = clickHandler;
    }

    public void click() {
        clickHandler.onClick();
    }
}
