package lesson7.enumeration;

/**
 * @author Dzmitry Fursevich
 */
public class DayClass {
    public static DayClass MONDAY = new DayClass();
    public static DayClass TUESDAY = new DayClass();
    //...

    private DayClass() {
    }

    public static DayClass[] values() {
        return new DayClass[]{MONDAY, TUESDAY};
    }
}
