package Solutions;

public class Main implements User 
{
    public static void main(String[] args) 
    {
        Reservation reservation = new Reservation();
        boolean stop = false;
        String userAnswer = "";

        do 
        {
            printListAirplane(reservation);
            System.out.print("Please enter the Flight Number from the list: ");
            userAnswer = User.userInput();
            int flightIndex = Integer.parseInt(userAnswer.split("\\.")[0]) - 1;

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
                System.out.println(e.getMessage());
            }
        }
        
        reservation.confirmReservation(flightIndex);
        System.out.println("Reserve is completed!");
    }

    public static void printListAirplane(Reservation reservation) 
    {
        reservation.printAirplaneList();
    }
}
