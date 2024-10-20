package Solutions;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ReservationTest 
{
    private Reservation reservation; // 예약 인스턴스를 저장할 변수
    private Airplane airplane; // 항공기 인스턴스를 저장할 변수

    // 각 테스트 실행 전에 호출되는 초기화 메서드
    @Before
    public void setUp() 
    {
        reservation = new Reservation(); // 새로운 Reservation 인스턴스를 생성
        airplane = new Airplane(); // 새로운 Airplane 인스턴스를 생성
    }

    // 예약 가능한 항공편 확인 테스트
    @Test
    public void testReserveAvailable() 
    {
        boolean result = reservation.reserve(0); // 첫 번째 항공편의 예약 가능성 확인
        assertTrue(result); // 예약 가능하면 true를 반환해야 함
    }

    // 예약 불가능한 항공편 확인 테스트
    @Test
    public void testReserveUnavailable() 
    {
        airplane.reserveFlight(1); // 두 번째 항공편을 예약된 상태로 시뮬레이션
        boolean result = reservation.reserve(1); // 두 번째 항공편의 예약 가능성 확인
        assertFalse(result); // 예약 불가능하면 false를 반환해야 함
    }
    
    // 예약 확인 테스트
    @Test
    public void testConfirmReservation() 
    {
        reservation.setFirstName("John"); // 이름 설정
        reservation.setLastName("Doe"); // 성 설정
        reservation.setPhoneNumber("1234567890"); // 전화번호 설정
        reservation.confirmReservation(0); // 첫 번째 항공편 예약 시도

        // 항공편이 이제 예약 불가능한지 확인
        assertFalse(airplane.isAvailable(0)); // 항공편 예약 후 더 이상 예약 가능하면 안 됨
    }

    // 항공편 목록 출력 테스트
    @Test
    public void testPrintAirplaneList() 
    {
        // 예외가 발생하지 않는지 확인하기 위한 간단한 테스트
        reservation.printAirplaneList(); // 항공편 목록 출력
    }
}
