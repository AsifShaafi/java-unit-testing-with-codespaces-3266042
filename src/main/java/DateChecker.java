import java.util.Arrays;

public class DateChecker {

    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public boolean has31Days(Month month) {
        switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> {
                return true;
            }
            case FEBRUARY, APRIL, JUNE, SEPTEMBER, NOVEMBER -> {
                return false;
            }
            default -> {
            }
        }
        return false;
    }

    


}
