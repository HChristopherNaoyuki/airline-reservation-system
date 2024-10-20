package Solutions;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AirplaneTest 
{
    private Airplane airplane; // 항공기 인스턴스를 저장할 변수

    // 각 테스트 실행 전에 호출되는 초기화 메서드
    @Before
    public void setUp() 
    {
        airplane = new Airplane(); // 새로운 Airplane 인스턴스를 생성
    }

    // 항공편 정보를 가져오는 메서드 테스트
    @Test
    public void testGetAirplace() 
    {
        String expected = "1. KE123: Korean Air's international flight (Seoul(ICN) - Tokyo(HND))";
        assertEquals(expected, airplane.getAirplace("0")); // 인덱스는 0부터 시작하므로 "0"을 사용
    }

    // 항공편 코드를 가져오는 메서드 테스트
    @Test
    public void testGetFlightCode() 
    {
        String expected = "KE123";
        assertEquals(expected, airplane.getFlightCode("0")); // 인덱스는 0부터 시작하므로 "0"을 사용
    }

    // 예약 가능 목록을 가져오는 메서드 테스트
    @Test
    public void testReserveAvailableList() 
    {
        boolean[] availability = airplane.getReserveAvailableList(); // 예약 가능 목록 가져오기
        assertEquals(true, availability[0]); // 첫 번째 항공편은 예약 가능해야 함
        assertEquals(false, availability[1]); // 두 번째 항공편은 예약 불가능해야 함
    }

    // 항공편이 예약 가능한지 확인하는 메서드 테스트
    @Test
    public void testIsAvailable() 
    {
        assertTrue(airplane.isAvailable(0)); // 첫 번째 항공편은 예약 가능해야 함
        assertFalse(airplane.isAvailable(1)); // 두 번째 항공편은 예약 불가능해야 함
    }

    // 항공편 예약 기능 테스트
    @Test
    public void testReserveFlight() 
    {
        airplane.reserveFlight(0); // 첫 번째 항공편 예약
        assertFalse(airplane.isAvailable(0)); // 예약 후 첫 번째 항공편은 더 이상 예약 불가능해야 함
    }
}
