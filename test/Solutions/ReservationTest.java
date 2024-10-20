package Solutions;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ReservationTest 
{
    private Reservation reservation;
    private Airplane airplane;

    @Before
    public void setUp() 
    {
        reservation = new Reservation();
        airplane = new Airplane();
    }

    @Test
    public void testReserveAvailable() 
    {
        boolean result = reservation.reserve(0);
        assertTrue(result);
    }

    @Test
    public void testReserveUnavailable() 
    {
        airplane.reserveFlight(1);
        boolean result = reservation.reserve(1);
        assertFalse(result);
    }
    
    @Test
    public void testConfirmReservation() 
    {
        reservation.setFirstName("John");
        reservation.setLastName("Doe");
        reservation.setPhoneNumber("1234567890");
        reservation.confirmReservation(0);
        assertFalse(airplane.isAvailable(0));
    }

    @Test
    public void testPrintAirplaneList() 
    {
        reservation.printAirplaneList();
    }
}
