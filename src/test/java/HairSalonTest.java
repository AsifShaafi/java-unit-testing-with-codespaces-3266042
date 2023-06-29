import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
        String[] expected = {"Monday", "Tuesday"};

        String[] actual = hairSalon.getOpeningDays();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSalonIsOpenOnMonday() {
        boolean actual = hairSalon.isOpen("Monday");

        assertTrue(actual);
    }

    @Test
    public void testSalonIsClosedOnWednesday() {
        boolean actual = hairSalon.isOpen("Wednesday");

        assertFalse(actual);
    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            hairSalon.isOpen("Weekend");
        });

        String expected = "Only weekdays are valid";
        String actual = exception.getMessage();

        assertEquals(expected, actual);
    }

}