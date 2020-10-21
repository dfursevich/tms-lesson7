package lesson7.enumeration;

/**
 * @author Dzmitry Fursevich
 */
public class EnumRunner {
    public static void main(String[] args) {
        Day someDay = Day.MONDAY;
        if (someDay == Day.FRIDAY) {
            System.out.println();
        }

        DayClass day2 = DayClass.MONDAY;
        if (day2 == DayClass.MONDAY) {
            System.out.println();
        }
    }
}
