package Solutions;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UserInfoTest 
{
    private UserInfo userInfo; // UserInfo 인스턴스를 저장할 변수

    // 각 테스트 실행 전에 호출되는 초기화 메서드
    @Before
    public void setUp() 
    {
        userInfo = new UserInfo(); // 새로운 UserInfo 인스턴스를 생성
    }

    // 이름을 설정하는 메서드 테스트
    @Test
    public void testSetFirstName() 
    {
        userInfo.setFirstName("John"); // "John"이라는 이름 설정
        assertEquals("John", userInfo.getFirstName()); // 설정한 이름이 올바른지 확인
    }

    // 성을 설정하는 메서드 테스트
    @Test
    public void testSetLastName() 
    {
        userInfo.setLastName("Doe"); // "Doe"라는 성 설정
        assertEquals("Doe", userInfo.getLastName()); // 설정한 성이 올바른지 확인
    }

    // 유효한 전화번호를 설정하는 메서드 테스트
    @Test
    public void testSetPhoneNumberValid() 
    {
        userInfo.setPhoneNumber("1234567890"); // 유효한 전화번호 설정
        assertEquals("1234567890", userInfo.getPhoneNumber()); // 설정한 전화번호가 올바른지 확인
    }

    // 유효하지 않은 전화번호를 설정하는 메서드 테스트
    @Test(expected = IllegalArgumentException.class)
    public void testSetPhoneNumberInvalid() 
    {
        userInfo.setPhoneNumber("123ABC"); // 숫자가 아닌 문자 포함된 전화번호 설정 시 예외 발생 확인
    }

    // 사용자 정보를 문자열 형식으로 반환하는 메서드 테스트
    @Test
    public void testNameString() 
    {
        userInfo.setFirstName("John"); // 이름 설정
        userInfo.setLastName("Doe"); // 성 설정
        userInfo.setPhoneNumber("1234567890"); // 전화번호 설정
        
        // 예상 문자열 생성
        String expected = "First Name: John\nLast Name: Doe\nMobile Phone: 1234567890";
        assertEquals(expected, userInfo.nameString()); // 생성된 문자열이 예상과 일치하는지 확인
    }
}
