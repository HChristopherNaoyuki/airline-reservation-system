package Solutions;

public final class UserInfo 
{
    // 사용자 정보를 저장하기 위한 클래스
    private String firstName; // 사용자의 이름
    private String lastName;  // 사용자의 성
    private String phoneNumber; // 사용자의 전화번호

    // 기본 생성자
    public UserInfo() 
    {
        // 초기화할 내용 없음
    }

    // 매개변수를 사용하는 생성자
    public UserInfo(String firstName, String lastName, String phoneNumber) 
    {
        this.firstName = firstName; // 이름 초기화
        this.lastName = lastName;   // 성 초기화
        setPhoneNumber(phoneNumber); // 전화번호 초기화 (유효성 검증 포함)
    }

    // 이름을 반환하는 메서드
    public String getFirstName() 
    {
        return firstName; // 사용자의 이름 반환
    }

    // 이름을 설정하는 메서드
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName; // 사용자의 이름 설정
    }

    // 성을 반환하는 메서드
    public String getLastName() 
    {
        return lastName; // 사용자의 성 반환
    }

    // 성을 설정하는 메서드
    public void setLastName(String lastName) 
    {
        this.lastName = lastName; // 사용자의 성 설정
    }

    // 전화번호를 반환하는 메서드
    public String getPhoneNumber() 
    {
        return phoneNumber; // 사용자의 전화번호 반환
    }

    // 전화번호를 설정하는 메서드
    public void setPhoneNumber(String phoneNumber) 
    {
        // 전화번호가 숫자인지 검증
        if (!phoneNumber.matches("\\d+"))  
        {
            throw new IllegalArgumentException("Phone number must be numeric."); // 숫자가 아닐 경우 예외 발생
        }
        this.phoneNumber = phoneNumber; // 전화번호 설정
    }

    // 사용자 정보를 문자열 형식으로 반환하는 메서드
    public String nameString() 
    {
        String result; // 결과 문자열
        result = "First Name: " + firstName; // 이름 추가
        result += "\nLast Name: " + lastName; // 성 추가
        result += "\nMobile Phone: " + phoneNumber; // 전화번호 추가
        return result; // 최종 문자열 반환
    }
}
