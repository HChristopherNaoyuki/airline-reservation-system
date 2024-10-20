package Solutions;

public class Reservation 
{
    Airplane airplane = new Airplane();
    UserInfo userInfo = new UserInfo();

    // 예약 가능 여부 확인
    public boolean reserve(int flightIndex) 
    {
        if (airplane.isAvailable(flightIndex)) 
        {
            System.out.println("It's available. Please enter your information to book the ticket.");
            return true;
        } 
        else 
        {
            System.out.println("Unfortunately, it is fully booked, choose another itinerary.");
            return false;
        }
    }

    // 사용자 정보 설정
    public void setFirstName(String firstName) 
    {
        userInfo.setFirstName(firstName);
    }

    public void setLastName(String lastName) 
    {
        userInfo.setLastName(lastName);
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        userInfo.setPhoneNumber(phoneNumber);
    }

    // 예약 확인 및 업데이트
    public void confirmReservation(int flightIndex) 
    {
        airplane.reserveFlight(flightIndex);
        System.out.println("Reservation Details:");
        System.out.println(userInfo.nameString());
        System.out.println("Flight: " + airplane.getAirplace(String.valueOf(flightIndex)));
    }

    // 항공편 리스트 출력
    public void printAirplaneList() 
    {
        String[] airplaneList = airplane.getAirpleList();
        for (String flight : airplaneList) 
        {
            System.out.println(flight);
        }
    }
}
