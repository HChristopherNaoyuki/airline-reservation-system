package Solutions;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AirplaneTest 
{
    private Airplane airplane;

    @Before
    public void setUp() 
    {
        airplane = new Airplane();
    }

    @Test
    public void testGetAirplace() 
    {
        String expected = "1. KE123: Korean Air's international flight (Seoul(ICN) - Tokyo(HND))";
        assertEquals(expected, airplane.getAirplace("0"));
    }

    @Test
    public void testGetFlightCode() 
    {
        String expected = "KE123";
        assertEquals(expected, airplane.getFlightCode("0"));
    }

    @Test
    public void testReserveAvailableList() 
    {
        boolean[] availability = airplane.getReserveAvailableList();
        assertEquals(true, availability[0]);
        assertEquals(false, availability[1]);
    }

    @Test
    public void testIsAvailable() 
    {
        assertTrue(airplane.isAvailable(0));
        assertFalse(airplane.isAvailable(1));
    }

    @Test
    public void testReserveFlight() 
    {
        airplane.reserveFlight(0);
        assertFalse(airplane.isAvailable(0));
    }
}
