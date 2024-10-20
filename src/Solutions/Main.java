package Solutions;

public class Main implements User 
{
    public static void main(String[] args) 
    {
        Reservation reservation = new Reservation(); // 예약 객체 초기화
        boolean stop = false;
        String userAnswer = "";

        do 
        {
            printListAirplane(reservation);
            System.out.print("Please enter the Flight Number from the list: ");
            userAnswer = User.userInput();
            int flightIndex = Integer.parseInt(userAnswer.split("\\.")[0]) - 1;

            // 예약이 불가능한 경우
            if (!reservation.reserve(flightIndex)) 
            {
                continue;
            }

            bookAirplane(reservation, flightIndex);
            System.out.print("Continue? (y/n) ");
            if (User.userInput().equalsIgnoreCase("n")) 
            {
                stop = true;
            }
        } while (!stop);
    }

    // 항공편 예약
    public static void bookAirplane(Reservation reservation, int flightIndex) 
    {
        System.out.println();
        System.out.print("Please input your First Name:  ");
        String firstName = User.reserveInput();
        reservation.setFirstName(firstName);
        
        System.out.println();
        System.out.print("Please input your Last Name: ");
        String lastName = User.reserveInput();
        reservation.setLastName(lastName);
        
        String phoneNumber;
        while (true) 
        {
            System.out.print("Please input your Phone Number: ");
            phoneNumber = User.reserveInput();
            try 
            {
                reservation.setPhoneNumber(phoneNumber);
                break;
            } 
            catch (IllegalArgumentException e) 
            {
                System.out.println(e.getMessage()); // Print error message
            }
        }
        
        reservation.confirmReservation(flightIndex);
        System.out.println("Reserve is completed!");
    }

    // 항공편 리스트 출력
    public static void printListAirplane(Reservation reservation) 
    {
        reservation.printAirplaneList();
    }
}
